package ag;

import android.util.SparseIntArray;
import hh.z3;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import jh.s6;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import rh.x5;

public final class h implements Comparator {

    public final int f406a;

    public final Object f407b;

    public h(Object obj, int i10) {
        this.f406a = i10;
        this.f407b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        boolean z10;
        ?? r10;
        int iIndexOf;
        int iIndexOf2;
        switch (this.f406a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f407b;
                return sparseIntArray.get(((m) obj).f556e, Integer.MAX_VALUE) - sparseIntArray.get(((m) obj2).f556e, Integer.MAX_VALUE);
            case 1:
                return ((Collator) this.f407b).compare((String) obj, (String) obj2);
            case 2:
                float[] fArr = ((z3) this.f407b).f10416r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 3:
                s6 s6Var = (s6) this.f407b;
                int i10 = s6Var.f13955a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
                long peerDialogId2 = DialogObject.getPeerDialogId(peerStories2.peer);
                boolean zK = s6Var.K(peerDialogId);
                boolean zK2 = s6Var.K(peerDialogId2);
                boolean zJ = s6Var.J(peerDialogId);
                boolean zJ2 = s6Var.J(peerDialogId2);
                boolean zF = s6Var.F(peerDialogId);
                boolean zF2 = s6Var.F(peerDialogId2);
                if (zF != zF2) {
                    return (zF2 ? 1 : 0) - (zF ? 1 : 0);
                }
                if (zK != zK2) {
                    return (zK2 ? 1 : 0) - (zK ? 1 : 0);
                }
                if (zJ != zJ2) {
                    return (zJ2 ? 1 : 0) - (zJ ? 1 : 0);
                }
                boolean zIsService = UserObject.isService(peerDialogId);
                boolean zIsService2 = UserObject.isService(peerDialogId2);
                if (zIsService != zIsService2) {
                    return (zIsService2 ? 1 : 0) - (zIsService ? 1 : 0);
                }
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
                ?? r11 = user == null ? 0 : user.premium;
                TLRPC.User user2 = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId2));
                if (user2 == null) {
                    r10 = 0;
                } else {
                    z10 = user2.premium;
                }
                if (r11 == r10) {
                    r10 = z10;
                    return (peerStories2.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i0.a.i(1, peerStories2.stories)).date) - (peerStories.stories.isEmpty() ? 0 : ((TL_stories.StoryItem) i0.a.i(1, peerStories.stories)).date);
                }
                r10 = z10;
                return r10 - r11;
            case 4:
                ArrayList arrayList = (ArrayList) this.f407b;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i11 = albumEntry.bucketId;
                if (i11 != 0 || albumEntry2.bucketId == 0) {
                    if ((i11 != 0 && albumEntry2.bucketId == 0) || (iIndexOf = arrayList.indexOf(albumEntry)) > (iIndexOf2 = arrayList.indexOf(albumEntry2))) {
                        return 1;
                    }
                    if (iIndexOf >= iIndexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 5:
                x5 x5Var = (x5) this.f407b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int iB = x5Var.b(pagetablecell);
                int iB2 = x5Var.b(pagetablecell2);
                return iB != iB2 ? Integer.compare(iB, iB2) : Integer.compare(x5Var.a(pagetablecell), x5Var.a(pagetablecell2));
            default:
                y3.v vVar = (y3.v) this.f407b;
                return vVar.b(obj2) - vVar.b(obj);
        }
    }
}
