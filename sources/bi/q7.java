package bi;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class q7 implements Comparator {
    public final int f3588a;
    public final Object f3589b;

    public q7(Object obj, int i10) {
        this.f3588a = i10;
        this.f3589b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i10;
        int indexOf;
        int indexOf2;
        switch (this.f3588a) {
            case 0:
                x8 x8Var = (x8) this.f3589b;
                int i11 = x8Var.f3962a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = x8Var.K(peerDialogId);
                boolean K2 = x8Var.K(peerDialogId2);
                boolean J = x8Var.J(peerDialogId);
                boolean J2 = x8Var.J(peerDialogId2);
                boolean F = x8Var.F(peerDialogId);
                boolean F2 = x8Var.F(peerDialogId2);
                if (F != F2) {
                    return (F2 ? 1 : 0) - (F ? 1 : 0);
                }
                if (K == K2) {
                    if (J == J2) {
                        boolean isService = UserObject.isService(peerDialogId);
                        boolean isService2 = UserObject.isService(peerDialogId2);
                        if (isService == isService2) {
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId));
                            int i12 = 0;
                            if (user == null) {
                                r02 = 0;
                            } else {
                                r02 = user.premium;
                            }
                            TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerDialogId2));
                            if (user2 == null) {
                                r12 = 0;
                            } else {
                                r12 = user2.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i10 = 0;
                                } else {
                                    i10 = ((TL_stories.StoryItem) i2.d.g(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) i2.d.g(1, peerStories2.stories)).date;
                                }
                                return i12 - i10;
                            }
                            return r12 - r02;
                        }
                        return (isService2 ? 1 : 0) - (isService ? 1 : 0);
                    }
                    return (J2 ? 1 : 0) - (J ? 1 : 0);
                }
                return (K2 ? 1 : 0) - (K ? 1 : 0);
            case 1:
                ArrayList arrayList = (ArrayList) this.f3589b;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i13 = albumEntry.bucketId;
                if (i13 != 0 || albumEntry2.bucketId == 0) {
                    if ((i13 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 2:
                ji.m6 m6Var = (ji.m6) this.f3589b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = m6Var.b(pagetablecell);
                int b11 = m6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(m6Var.a(pagetablecell), m6Var.a(pagetablecell2));
            case 3:
                r2.v vVar = (r2.v) this.f3589b;
                return vVar.c(obj2) - vVar.c(obj);
            case 4:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f3589b;
                return sparseIntArray.get(((sg.h) obj).e, Integer.MAX_VALUE) - sparseIntArray.get(((sg.h) obj2).e, Integer.MAX_VALUE);
            case 5:
                return ((Collator) this.f3589b).compare((String) obj, (String) obj2);
            default:
                float[] fArr = ((zh.l2) this.f3589b).f50787r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
        }
    }
}
