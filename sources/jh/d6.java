package jh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

public final class d6 extends j6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public d6(int i10, String str, String str2) {
        super(i10, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override
    public final MessageObject f(int i10) {
        if (i10 < 0) {
            return null;
        }
        ArrayList arrayList = this.f13540i;
        if (i10 >= arrayList.size()) {
            return null;
        }
        return (MessageObject) arrayList.get(i10);
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
        return this.f13540i.size();
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
    public final boolean q(final int i10, final List list, final boolean z10) {
        TLObject userOrChat;
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i10;
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
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        int i11 = this.f13536c;
        if (zIsEmpty) {
            userOrChat = null;
        } else {
            userOrChat = MessagesController.getInstance(i11).getUserOrChat(str2);
            if (userOrChat == null) {
                MessagesController.getInstance(i11).getUserNameResolver().resolve(str2, new d5.d() {
                    @Override
                    public final void accept(Object obj) {
                        d6 d6Var = this.f13161a;
                        g6 g6Var = d6Var.f13548q;
                        TLObject userOrChat2 = MessagesController.getInstance(d6Var.f13536c).getUserOrChat(d6Var.D);
                        d6Var.G = false;
                        if (userOrChat2 != null) {
                            d6Var.q(i10, list, z10);
                            return;
                        }
                        d6Var.J = 0;
                        d6Var.H = "";
                        AndroidUtilities.cancelRunOnUIThread(g6Var);
                        AndroidUtilities.runOnUIThread(g6Var);
                    }
                });
                return true;
            }
        }
        if (userOrChat != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = MessagesController.getInputPeer(userOrChat);
        }
        this.I = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_searchPosts, new cf.a(this, 12));
        return true;
    }

    @Override
    public final boolean r(int i10) {
        return false;
    }

    public d6(int i10, TL_stories.MediaArea mediaArea) {
        super(i10, 0L, 3, -1, null);
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
