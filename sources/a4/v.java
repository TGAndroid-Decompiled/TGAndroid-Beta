package a4;

import android.util.SparseIntArray;
import j7.l1;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import jh.z3;
import lh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import th.x5;
public final class v implements Comparator {
    public final int f151a;
    public final Object f152b;

    public v(Object obj, int i10) {
        this.f151a = i10;
        this.f152b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i10;
        int indexOf;
        int indexOf2;
        switch (this.f151a) {
            case 0:
                a0 a0Var = (a0) this.f152b;
                return a0Var.b(obj2) - a0Var.b(obj);
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f152b;
                return sparseIntArray.get(((cg.k) obj).f3180e, Integer.MAX_VALUE) - sparseIntArray.get(((cg.k) obj2).f3180e, Integer.MAX_VALUE);
            case 2:
                return ((Collator) this.f152b).compare((String) obj, (String) obj2);
            case 3:
                float[] fArr = ((z3) this.f152b).f13164r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 4:
                s6 s6Var = (s6) this.f152b;
                int i11 = s6Var.f16218a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = s6Var.K(peerDialogId);
                boolean K2 = s6Var.K(peerDialogId2);
                boolean J = s6Var.J(peerDialogId);
                boolean J2 = s6Var.J(peerDialogId2);
                boolean F = s6Var.F(peerDialogId);
                boolean F2 = s6Var.F(peerDialogId2);
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
                                    i10 = ((TL_stories.StoryItem) l1.i(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) l1.i(1, peerStories2.stories)).date;
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
            case 5:
                ArrayList arrayList = (ArrayList) this.f152b;
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
            default:
                x5 x5Var = (x5) this.f152b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = x5Var.b(pagetablecell);
                int b11 = x5Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(x5Var.a(pagetablecell), x5Var.a(pagetablecell2));
        }
    }
}
