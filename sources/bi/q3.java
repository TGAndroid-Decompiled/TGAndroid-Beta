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
public final class q3 implements Comparator {
    public final int f3448a;
    public final Object f3449b;

    public q3(Object obj, int i10) {
        this.f3448a = i10;
        this.f3449b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        ?? r02;
        ?? r12;
        int i10;
        switch (this.f3448a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.f3449b;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i11 = albumEntry.bucketId;
                if (i11 != 0 || albumEntry2.bucketId == 0) {
                    if ((i11 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                hi.l6 l6Var = (hi.l6) this.f3449b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = l6Var.b(pagetablecell);
                int b11 = l6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(l6Var.a(pagetablecell), l6Var.a(pagetablecell2));
            case 2:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f3449b;
                return sparseIntArray.get(((qg.h) obj).e, Integer.MAX_VALUE) - sparseIntArray.get(((qg.h) obj2).e, Integer.MAX_VALUE);
            case 3:
                r2.v vVar = (r2.v) this.f3449b;
                return vVar.a(obj2) - vVar.a(obj);
            case 4:
                return ((Collator) this.f3449b).compare((String) obj, (String) obj2);
            case 5:
                float[] fArr = ((xh.q2) this.f3449b).f45917r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            default:
                zh.i5 i5Var = (zh.i5) this.f3449b;
                int i12 = i5Var.f48499a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = i5Var.K(peerDialogId);
                boolean K2 = i5Var.K(peerDialogId2);
                boolean J = i5Var.J(peerDialogId);
                boolean J2 = i5Var.J(peerDialogId2);
                boolean F = i5Var.F(peerDialogId);
                boolean F2 = i5Var.F(peerDialogId2);
                if (F != F2) {
                    return (F2 ? 1 : 0) - (F ? 1 : 0);
                }
                if (K == K2) {
                    if (J == J2) {
                        boolean isService = UserObject.isService(peerDialogId);
                        boolean isService2 = UserObject.isService(peerDialogId2);
                        if (isService == isService2) {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                            int i13 = 0;
                            if (user == null) {
                                r02 = 0;
                            } else {
                                r02 = user.premium;
                            }
                            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId2));
                            if (user2 == null) {
                                r12 = 0;
                            } else {
                                r12 = user2.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i10 = 0;
                                } else {
                                    i10 = ((TL_stories.StoryItem) hc.b.i(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i13 = ((TL_stories.StoryItem) hc.b.i(1, peerStories2.stories)).date;
                                }
                                return i13 - i10;
                            }
                            return r12 - r02;
                        }
                        return (isService2 ? 1 : 0) - (isService ? 1 : 0);
                    }
                    return (J2 ? 1 : 0) - (J ? 1 : 0);
                }
                return (K2 ? 1 : 0) - (K ? 1 : 0);
        }
    }
}
