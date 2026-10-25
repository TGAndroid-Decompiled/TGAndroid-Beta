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
public final class p5 implements Comparator {
    public final int f5228a;
    public final Object f5229b;

    public p5(Object obj, int i10) {
        this.f5228a = i10;
        this.f5229b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i10;
        int indexOf;
        int indexOf2;
        switch (this.f5228a) {
            case 0:
                float[] fArr = ((s5) this.f5229b).f5402r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                di.h7 h7Var = (di.h7) this.f5229b;
                int i11 = h7Var.f8630a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = h7Var.K(peerDialogId);
                boolean K2 = h7Var.K(peerDialogId2);
                boolean J = h7Var.J(peerDialogId);
                boolean J2 = h7Var.J(peerDialogId2);
                boolean F = h7Var.F(peerDialogId);
                boolean F2 = h7Var.F(peerDialogId2);
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
                                    i10 = ((TL_stories.StoryItem) ic.a.g(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) ic.a.g(1, peerStories2.stories)).date;
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
            case 2:
                ArrayList arrayList = (ArrayList) this.f5229b;
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
            case 3:
                li.h6 h6Var = (li.h6) this.f5229b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = h6Var.b(pagetablecell);
                int b11 = h6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(h6Var.a(pagetablecell), h6Var.a(pagetablecell2));
            case 4:
                r2.v vVar = (r2.v) this.f5229b;
                return vVar.c(obj2) - vVar.c(obj);
            case 5:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f5229b;
                return sparseIntArray.get(((tg.h) obj).e, Integer.MAX_VALUE) - sparseIntArray.get(((tg.h) obj2).e, Integer.MAX_VALUE);
            default:
                return ((Collator) this.f5229b).compare((String) obj, (String) obj2);
        }
    }
}
