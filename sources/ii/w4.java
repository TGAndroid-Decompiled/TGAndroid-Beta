package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11740a;
    public final h3 f11741b;
    public MessageObject f11742c;
    public VideoEditedInfo d;
    public String e;
    public boolean f11743f;
    public boolean h;
    public boolean f11744n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f11740a = i10;
        this.f11741b = h3Var;
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
        if (!this.f11744n && !this.h) {
            this.h = true;
            if (this.f11742c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f11742c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f11744n) {
            return;
        }
        this.f11744n = true;
        d();
        h3 h3Var = this.f11741b;
        w3 w3Var = h3Var.f11413c;
        IdentityHashMap identityHashMap = w3Var.f11704a4;
        u uVar = h3Var.f11411a;
        identityHashMap.remove(uVar);
        uVar.f11637a = 3;
        w3Var.q4(h3Var.f11412b, uVar);
        w3Var.f11713h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f11740a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f11741b;
        a aVar = h3Var.f11412b;
        u uVar = h3Var.f11411a;
        w3 w3Var = h3Var.f11413c;
        if (!this.h && !this.f11744n && i11 == this.f11740a && objArr.length != 0 && objArr[0] == this.f11742c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f11640f = ((Float) objArr[4]).floatValue();
                View z12 = w3Var.z1(aVar);
                if (z12 instanceof u4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f11744n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.f11704a4.remove(uVar);
                    uVar.f11638b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f11643j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f11644k = i13;
                    }
                    uVar.f11645l = 0;
                    uVar.f11646m = 0;
                    uVar.f11640f = 0.0f;
                    w3Var.n4(aVar);
                    w3Var.L4(h3Var.f11412b, uVar, str, true, uVar.f11643j, uVar.f11644k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
