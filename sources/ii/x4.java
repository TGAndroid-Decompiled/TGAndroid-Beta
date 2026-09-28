package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class x4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11755a;
    public final i3 f11756b;
    public MessageObject f11757c;
    public VideoEditedInfo d;
    public String e;
    public boolean f11758f;
    public boolean h;
    public boolean f11759n;

    public x4(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f11755a = i10;
        this.f11756b = i3Var;
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
        if (!this.f11759n && !this.h) {
            this.h = true;
            if (this.f11757c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f11757c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f11759n) {
            return;
        }
        this.f11759n = true;
        d();
        i3 i3Var = this.f11756b;
        x3 x3Var = i3Var.f11430c;
        IdentityHashMap identityHashMap = x3Var.f11719a4;
        u uVar = i3Var.f11428a;
        identityHashMap.remove(uVar);
        uVar.f11633a = 3;
        x3Var.q4(i3Var.f11429b, uVar);
        x3Var.f11728h3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f11755a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f11756b;
        a aVar = i3Var.f11429b;
        u uVar = i3Var.f11428a;
        x3 x3Var = i3Var.f11430c;
        if (!this.h && !this.f11759n && i11 == this.f11755a && objArr.length != 0 && objArr[0] == this.f11757c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f11636f = ((Float) objArr[4]).floatValue();
                View z12 = x3Var.z1(aVar);
                if (z12 instanceof v4) {
                    z12.requestLayout();
                    z12.invalidate();
                }
                if (longValue > 0) {
                    this.f11759n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.f11719a4.remove(uVar);
                    uVar.f11634b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f11639j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f11640k = i13;
                    }
                    uVar.f11641l = 0;
                    uVar.f11642m = 0;
                    uVar.f11636f = 0.0f;
                    x3Var.n4(aVar);
                    x3Var.L4(i3Var.f11429b, uVar, str, true, uVar.f11639j, uVar.f11640k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
