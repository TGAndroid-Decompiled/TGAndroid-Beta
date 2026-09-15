package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class w4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11738a;
    public final h3 f11739b;
    public MessageObject f11740c;
    public VideoEditedInfo d;
    public String e;
    public boolean f11741f;
    public boolean h;
    public boolean f11742n;

    public w4(int i10, MediaController.PhotoEntry photoEntry, h3 h3Var) {
        this.f11738a = i10;
        this.f11739b = h3Var;
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
        if (!this.f11742n && !this.h) {
            this.h = true;
            if (this.f11740c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f11740c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f11742n) {
            return;
        }
        this.f11742n = true;
        d();
        h3 h3Var = this.f11739b;
        w3 w3Var = h3Var.f11411c;
        IdentityHashMap identityHashMap = w3Var.f11702a4;
        u uVar = h3Var.f11409a;
        identityHashMap.remove(uVar);
        uVar.f11635a = 3;
        w3Var.q4(h3Var.f11410b, uVar);
        w3Var.f11711h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f11738a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h3 h3Var = this.f11739b;
        a aVar = h3Var.f11410b;
        u uVar = h3Var.f11409a;
        w3 w3Var = h3Var.f11411c;
        if (!this.h && !this.f11742n && i11 == this.f11738a && objArr.length != 0 && objArr[0] == this.f11740c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f11638f = ((Float) objArr[4]).floatValue();
                View z12 = w3Var.z1(aVar);
                if (z12 instanceof u4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f11742n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    w3Var.f11702a4.remove(uVar);
                    uVar.f11636b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f11641j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f11642k = i13;
                    }
                    uVar.f11643l = 0;
                    uVar.f11644m = 0;
                    uVar.f11638f = 0.0f;
                    w3Var.n4(aVar);
                    w3Var.L4(h3Var.f11410b, uVar, str, true, uVar.f11641j, uVar.f11642k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
