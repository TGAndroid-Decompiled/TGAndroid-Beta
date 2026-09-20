package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11742a;
    public final h3 f11743b;
    public MessageObject f11744c;
    public VideoEditedInfo d;
    public String e;
    public boolean f11745f;
    public boolean h;
    public boolean f11746n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f11742a = i10;
        this.f11743b = h3Var;
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
        if (!this.f11746n && !this.h) {
            this.h = true;
            if (this.f11744c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f11744c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f11746n) {
            return;
        }
        this.f11746n = true;
        d();
        h3 h3Var = this.f11743b;
        w3 w3Var = h3Var.f11415c;
        IdentityHashMap identityHashMap = w3Var.f11706a4;
        u uVar = h3Var.f11413a;
        identityHashMap.remove(uVar);
        uVar.f11639a = 3;
        w3Var.r4(h3Var.f11414b, uVar);
        w3Var.f11715h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f11742a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f11743b;
        a aVar = h3Var.f11414b;
        u uVar = h3Var.f11413a;
        w3 w3Var = h3Var.f11415c;
        if (!this.h && !this.f11746n && i11 == this.f11742a && objArr.length != 0 && objArr[0] == this.f11744c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f11642f = ((Float) objArr[4]).floatValue();
                View A1 = w3Var.A1(aVar);
                if (A1 instanceof u4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f11746n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.f11706a4.remove(uVar);
                    uVar.f11640b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f11645j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f11646k = i13;
                    }
                    uVar.f11647l = 0;
                    uVar.f11648m = 0;
                    uVar.f11642f = 0.0f;
                    w3Var.o4(aVar);
                    w3Var.M4(h3Var.f11414b, uVar, str, true, uVar.f11645j, uVar.f11646k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
