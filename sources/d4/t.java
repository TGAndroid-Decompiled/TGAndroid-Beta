package d4;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import kf.k0;
import lh.y3;
import nh.t6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import vh.a6;
public final class t implements Comparator {
    public final int f4183a;
    public final Object f4184b;

    public t(Object obj, int i10) {
        this.f4183a = i10;
        this.f4184b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i10;
        int indexOf;
        int indexOf2;
        switch (this.f4183a) {
            case 0:
                x xVar = (x) this.f4184b;
                return xVar.b(obj2) - xVar.b(obj);
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f4184b;
                return sparseIntArray.get(((eg.k) obj).e, Integer.MAX_VALUE) - sparseIntArray.get(((eg.k) obj2).e, Integer.MAX_VALUE);
            case 2:
                return ((Collator) this.f4184b).compare((String) obj, (String) obj2);
            case 3:
                float[] fArr = ((y3) this.f4184b).f13371r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 4:
                t6 t6Var = (t6) this.f4184b;
                int i11 = t6Var.f15897a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = t6Var.K(peerDialogId);
                boolean K2 = t6Var.K(peerDialogId2);
                boolean J = t6Var.J(peerDialogId);
                boolean J2 = t6Var.J(peerDialogId2);
                boolean F = t6Var.F(peerDialogId);
                boolean F2 = t6Var.F(peerDialogId2);
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
                                    i10 = ((TL_stories.StoryItem) k0.i(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) k0.i(1, peerStories2.stories)).date;
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
                ArrayList arrayList = (ArrayList) this.f4184b;
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
                a6 a6Var = (a6) this.f4184b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = a6Var.b(pagetablecell);
                int b11 = a6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(a6Var.a(pagetablecell), a6Var.a(pagetablecell2));
        }
    }
}
