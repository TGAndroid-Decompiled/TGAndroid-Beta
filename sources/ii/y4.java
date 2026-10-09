package ii;

import android.view.View;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEditedInfo;
public final class y4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f12858a;
    public final i3 f12859b;
    public MessageObject f12860c;
    public VideoEditedInfo d;
    public String f12861e;
    public boolean f12862f;
    public boolean h;
    public boolean f12863n;

    public y4(int i10, MediaController.PhotoEntry photoEntry, i3 i3Var) {
        this.f12858a = i10;
        this.f12859b = i3Var;
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
        if (!this.f12863n && !this.h) {
            this.h = true;
            if (this.f12860c != null && this.d != null) {
                try {
                    MediaController.getInstance().cancelVideoConvert(this.f12860c);
                } catch (Throwable unused) {
                }
            }
            d();
        }
    }

    public final void b() {
        if (this.f12863n) {
            return;
        }
        this.f12863n = true;
        d();
        i3 i3Var = this.f12859b;
        x3 x3Var = i3Var.f12490c;
        IdentityHashMap identityHashMap = x3Var.Y3;
        u uVar = i3Var.f12488a;
        identityHashMap.remove(uVar);
        uVar.f12710a = 3;
        x3Var.r4(i3Var.f12489b, uVar);
        x3Var.f12809f3.onContentChanged();
    }

    public final void d() {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f12858a);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingStarted);
        notificationCenter.removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        notificationCenter.removeObserver(this, NotificationCenter.filePreparingFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.f12859b;
        a aVar = i3Var.f12489b;
        u uVar = i3Var.f12488a;
        x3 x3Var = i3Var.f12490c;
        if (!this.h && !this.f12863n && i11 == this.f12858a && objArr.length != 0 && objArr[0] == this.f12860c) {
            if (i10 == NotificationCenter.fileNewChunkAvailable) {
                long longValue = ((Long) objArr[3]).longValue();
                uVar.f12714f = ((Float) objArr[4]).floatValue();
                View A1 = x3Var.A1(aVar);
                if (A1 instanceof w4) {
                    A1.requestLayout();
                    A1.invalidate();
                }
                if (longValue > 0) {
                    this.f12863n = true;
                    d();
                    String str = this.f12861e;
                    VideoEditedInfo videoEditedInfo = this.d;
                    int i12 = videoEditedInfo.resultWidth;
                    int i13 = videoEditedInfo.resultHeight;
                    int ceil = (int) Math.ceil(videoEditedInfo.estimatedDuration / 1000.0d);
                    x3Var.Y3.remove(uVar);
                    uVar.f12711b = true;
                    uVar.f12713e = str;
                    if (i12 > 0) {
                        uVar.f12717j = i12;
                    }
                    if (i13 > 0) {
                        uVar.f12718k = i13;
                    }
                    uVar.f12719l = 0;
                    uVar.f12720m = 0;
                    uVar.f12714f = 0.0f;
                    x3Var.o4(aVar);
                    x3Var.M4(i3Var.f12489b, uVar, str, true, uVar.f12717j, uVar.f12718k, ceil);
                }
            } else if (i10 == NotificationCenter.filePreparingFailed) {
                b();
            }
        }
    }
}
