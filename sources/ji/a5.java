package ji;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class a5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f13137a;
    public final i3 f13138b;
    public MessageObject f13139c;
    public VideoEditedInfo d;
    public String e;
    public boolean f13140f;
    public boolean h;
    public boolean f13141n;

    public a5(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f13137a = i10;
        this.f13138b = i3Var;
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
        if (!this.f13141n && !this.h) {
            this.h = true;
            if (this.f13139c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f13139c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f13141n) {
            return;
        }
        this.f13141n = true;
        d();
        i3 i3Var = this.f13138b;
        x3 x3Var = i3Var.f13331c;
        IdentityHashMap identityHashMap = x3Var.Y3;
        u uVar = i3Var.f13329a;
        identityHashMap.remove(uVar);
        uVar.f13538a = 3;
        x3Var.r4(i3Var.f13330b, uVar);
        x3Var.f13630f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f13137a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f13138b;
        a aVar = i3Var.f13330b;
        u uVar = i3Var.f13329a;
        x3 x3Var = i3Var.f13331c;
        if (!this.h && !this.f13141n && i11 == this.f13137a && objArr.length != 0 && objArr[0] == this.f13139c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f13541f = ((Float) objArr[4]).floatValue();
                View A1 = x3Var.A1(aVar);
                if (A1 instanceof y4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f13141n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.Y3.remove(uVar);
                    uVar.f13539b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f13544j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f13545k = i13;
                    }
                    uVar.f13546l = 0;
                    uVar.f13547m = 0;
                    uVar.f13541f = 0.0f;
                    x3Var.o4(aVar);
                    x3Var.M4(i3Var.f13330b, uVar, str, true, uVar.f13544j, uVar.f13545k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
