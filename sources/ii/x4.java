package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class x4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f11770a;
    public final i3 f11771b;
    public MessageObject f11772c;
    public VideoEditedInfo d;
    public String e;
    public boolean f11773f;
    public boolean h;
    public boolean f11774n;

    public x4(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f11770a = i10;
        this.f11771b = i3Var;
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
        if (!this.f11774n && !this.h) {
            this.h = true;
            if (this.f11772c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f11772c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f11774n) {
            return;
        }
        this.f11774n = true;
        d();
        i3 i3Var = this.f11771b;
        x3 x3Var = i3Var.f11444c;
        IdentityHashMap identityHashMap = x3Var.f11740h4;
        u uVar = i3Var.f11442a;
        identityHashMap.remove(uVar);
        uVar.f11647a = 3;
        x3Var.s4(i3Var.f11443b, uVar);
        x3Var.f11748o3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f11770a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f11771b;
        a aVar = i3Var.f11443b;
        u uVar = i3Var.f11442a;
        x3 x3Var = i3Var.f11444c;
        if (!this.h && !this.f11774n && i11 == this.f11770a && objArr.length != 0 && objArr[0] == this.f11772c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f11650f = ((Float) objArr[4]).floatValue();
                View B1 = x3Var.B1(aVar);
                if (B1 instanceof v4) {
                    B1.requestLayout();
                    B1.invalidate();
                }
                if (longValue > 0) {
                    this.f11774n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.f11740h4.remove(uVar);
                    uVar.f11648b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f11653j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f11654k = i13;
                    }
                    uVar.f11655l = 0;
                    uVar.f11656m = 0;
                    uVar.f11650f = 0.0f;
                    x3Var.p4(aVar);
                    x3Var.N4(i3Var.f11443b, uVar, str, true, uVar.f11653j, uVar.f11654k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
