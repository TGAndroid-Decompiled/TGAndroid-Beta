package bg;

import android.util.SparseIntArray;
import gh.b4;
import ih.v6;
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
import qh.w5;
public final class l0 implements Comparator {
    public final int f1864a;
    public final Object f1865b;

    public l0(Object obj, int i9) {
        this.f1864a = i9;
        this.f1865b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i9;
        int indexOf;
        int indexOf2;
        switch (this.f1864a) {
            case 0:
                return ((Collator) this.f1865b).compare((String) obj, (String) obj2);
            case 1:
                float[] fArr = ((b4) this.f1865b).f7848r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 2:
                v6 v6Var = (v6) this.f1865b;
                int i10 = v6Var.f12236a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean K = v6Var.K(peerDialogId);
                boolean K2 = v6Var.K(peerDialogId2);
                boolean J = v6Var.J(peerDialogId);
                boolean J2 = v6Var.J(peerDialogId2);
                boolean F = v6Var.F(peerDialogId);
                boolean F2 = v6Var.F(peerDialogId2);
                if (F != F2) {
                    return (F2 ? 1 : 0) - (F ? 1 : 0);
                }
                if (K == K2) {
                    if (J == J2) {
                        boolean isService = UserObject.isService(peerDialogId);
                        boolean isService2 = UserObject.isService(peerDialogId2);
                        if (isService == isService2) {
                            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                            int i11 = 0;
                            if (user == null) {
                                r02 = 0;
                            } else {
                                r02 = user.premium;
                            }
                            TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId2));
                            if (user2 == null) {
                                r12 = 0;
                            } else {
                                r12 = user2.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i9 = 0;
                                } else {
                                    i9 = ((TL_stories.StoryItem) j3.r0.j(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i11 = ((TL_stories.StoryItem) j3.r0.j(1, peerStories2.stories)).date;
                                }
                                return i11 - i9;
                            }
                            return r12 - r02;
                        }
                        return (isService2 ? 1 : 0) - (isService ? 1 : 0);
                    }
                    return (J2 ? 1 : 0) - (J ? 1 : 0);
                }
                return (K2 ? 1 : 0) - (K ? 1 : 0);
            case 3:
                ArrayList arrayList = (ArrayList) this.f1865b;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i12 = albumEntry.bucketId;
                if (i12 != 0 || albumEntry2.bucketId == 0) {
                    if ((i12 != 0 && albumEntry2.bucketId == 0) || (indexOf = arrayList.indexOf(albumEntry)) > (indexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 4:
                w5 w5Var = (w5) this.f1865b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = w5Var.b(pagetablecell);
                int b11 = w5Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(w5Var.a(pagetablecell), w5Var.a(pagetablecell2));
            case 5:
                y3.v vVar = (y3.v) this.f1865b;
                return vVar.b(obj2) - vVar.b(obj);
            default:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f1865b;
                return sparseIntArray.get(((zf.h) obj).f50516e, Integer.MAX_VALUE) - sparseIntArray.get(((zf.h) obj2).f50516e, Integer.MAX_VALUE);
        }
    }
}
