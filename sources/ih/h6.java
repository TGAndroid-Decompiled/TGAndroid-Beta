package ih;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class h6 extends n6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public h6(int i9, String str, String str2) {
        super(i9, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override
    public final MessageObject f(int i9) {
        if (i9 >= 0) {
            ArrayList arrayList = this.f11851i;
            if (i9 < arrayList.size()) {
                return (MessageObject) arrayList.get(i9);
            }
            return null;
        }
        return null;
    }

    @Override
    public final int g() {
        return this.J;
    }

    @Override
    public final ArrayList h() {
        return this.F;
    }

    @Override
    public final int i() {
        return this.f11851i.size();
    }

    @Override
    public final boolean k() {
        return this.G;
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean q(final int i9, final List list, final boolean z10) {
        TLObject tLObject;
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i9;
        String str = this.C;
        if (str != null) {
            tL_stories_searchPosts.flags |= 1;
            tL_stories_searchPosts.hashtag = str;
        }
        TL_stories.MediaArea mediaArea = this.E;
        if (mediaArea != null) {
            tL_stories_searchPosts.flags |= 2;
            tL_stories_searchPosts.area = mediaArea;
        }
        this.G = true;
        String str2 = this.D;
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i10 = this.f11847c;
        if (!isEmpty) {
            tLObject = MessagesController.getInstance(i10).getUserOrChat(str2);
            if (tLObject == null) {
                MessagesController.getInstance(i10).getUserNameResolver().resolve(str2, new d5.d() {
                    @Override
                    public final void accept(Object obj) {
                        Long l10 = (Long) obj;
                        h6 h6Var = h6.this;
                        k6 k6Var = h6Var.f11859q;
                        TLObject userOrChat = MessagesController.getInstance(h6Var.f11847c).getUserOrChat(h6Var.D);
                        h6Var.G = false;
                        if (userOrChat != null) {
                            h6Var.q(i9, list, z10);
                            return;
                        }
                        h6Var.J = 0;
                        h6Var.H = "";
                        AndroidUtilities.cancelRunOnUIThread(k6Var);
                        AndroidUtilities.runOnUIThread(k6Var);
                    }
                });
                return true;
            }
        } else {
            tLObject = null;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = MessagesController.getInputPeer(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_searchPosts, new bf.a(this, 12));
        return true;
    }

    @Override
    public final boolean r(int i9) {
        return false;
    }

    public h6(int i9, TL_stories.MediaArea mediaArea) {
        super(i9, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void x() {
    }
}
