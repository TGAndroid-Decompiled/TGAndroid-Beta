package ji;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f14377a;
    public final g3 f14378b;
    public MessageObject f14379c;
    public VideoEditedInfo d;
    public String f14380e;
    public boolean f14381f;
    public boolean h;
    public boolean f14382n;

    public y4(int i10, MediaController.PhotoEntry photoEntry, g3 g3Var) {
        this.f14377a = i10;
        this.f14378b = g3Var;
    }

    public static boolean c(MediaController.PhotoEntry photoEntry) {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList;
        if (!photoEntry.isVideo) {
            ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                arrayList = photoEntry.croppedMediaEntities;
            } else {
                arrayList = photoEntry.mediaEntities;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i10);
                    if (mediaEntity != null) {
                        if (mediaEntity.type == 0) {
                            byte b10 = mediaEntity.subType;
                            if ((b10 & 1) != 0 || (b10 & 4) != 0) {
                                return true;
                            }
                        }
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        if (arrayList3 != null && !arrayList3.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a() {
        if (!this.f14382n && !this.h) {
            this.h = true;
            if (this.f14379c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f14379c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f14382n) {
            return;
        }
        this.f14382n = true;
        d();
        g3 g3Var = this.f14378b;
        v3 v3Var = g3Var.f13949c;
        IdentityHashMap identityHashMap = v3Var.f14266a4;
        u uVar = g3Var.f13947a;
        identityHashMap.remove(uVar);
        uVar.f14221a = 3;
        v3Var.p4(g3Var.f13948b, uVar);
        v3Var.f14275h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f14377a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g3 g3Var = this.f14378b;
        a aVar = g3Var.f13948b;
        u uVar = g3Var.f13947a;
        v3 v3Var = g3Var.f13949c;
        if (!this.h && !this.f14382n && i11 == this.f14377a && objArr.length != 0 && objArr[0] == this.f14379c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f14225f = ((Float) objArr[4]).floatValue();
                View y12 = v3Var.y1(aVar);
                if (y12 instanceof w4) {
                    y12.requestLayout();
                    y12.invalidate();
                }
                if (longValue > 0) {
                    this.f14382n = true;
                    d();
                    String str = this.f14380e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    v3Var.f14266a4.remove(uVar);
                    uVar.f14222b = true;
                    uVar.f14224e = str;
                    if (i12 > 0) {
                        uVar.f14228j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f14229k = i13;
                    }
                    uVar.f14230l = 0;
                    uVar.f14231m = 0;
                    uVar.f14225f = 0.0f;
                    v3Var.m4(aVar);
                    v3Var.K4(g3Var.f13948b, uVar, str, true, uVar.f14228j, uVar.f14229k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
