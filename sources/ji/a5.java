package ji;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class a5 implements NotificationCenter.NotificationCenterDelegate {
    public final int f13133a;
    public final i3 f13134b;
    public MessageObject f13135c;
    public VideoEditedInfo d;
    public String e;
    public boolean f13136f;
    public boolean h;
    public boolean f13137n;

    public a5(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f13133a = i10;
        this.f13134b = i3Var;
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
        if (!this.f13137n && !this.h) {
            this.h = true;
            if (this.f13135c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f13135c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f13137n) {
            return;
        }
        this.f13137n = true;
        d();
        i3 i3Var = this.f13134b;
        x3 x3Var = i3Var.f13328c;
        IdentityHashMap identityHashMap = x3Var.Y3;
        u uVar = i3Var.f13326a;
        identityHashMap.remove(uVar);
        uVar.f13535a = 3;
        x3Var.r4(i3Var.f13327b, uVar);
        x3Var.f13627f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f13133a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f13134b;
        a aVar = i3Var.f13327b;
        u uVar = i3Var.f13326a;
        x3 x3Var = i3Var.f13328c;
        if (!this.h && !this.f13137n && i11 == this.f13133a && objArr.length != 0 && objArr[0] == this.f13135c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f13538f = ((Float) objArr[4]).floatValue();
                View A1 = x3Var.A1(aVar);
                if (A1 instanceof y4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f13137n = true;
                    d();
                    String str = this.e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.Y3.remove(uVar);
                    uVar.f13536b = true;
                    uVar.e = str;
                    if (i12 > 0) {
                        uVar.f13541j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f13542k = i13;
                    }
                    uVar.f13543l = 0;
                    uVar.f13544m = 0;
                    uVar.f13538f = 0.0f;
                    x3Var.o4(aVar);
                    x3Var.M4(i3Var.f13327b, uVar, str, true, uVar.f13541j, uVar.f13542k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
