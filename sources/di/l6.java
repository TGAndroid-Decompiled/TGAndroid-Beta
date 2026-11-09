package di;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 extends r6 {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public l6(int i7, String str, String str2) {
        super(i7, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override
    public final ij f(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f9694i;
            if (i7 < arrayList.size()) {
                return (ij) arrayList.get(i7);
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
        return this.f9694i.size();
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
    public final boolean q(int i7, List list, boolean z9) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i7;
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
        TLObject tLObject = null;
        int i10 = this.f9690c;
        if (!isEmpty) {
            TLObject f22 = qp.s1(i10).f2(str2);
            if (f22 == null) {
                qp.s1(i10).d2().a(str2, null, new r2(this, z9, i7, list));
                return true;
            }
            tLObject = f22;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = qp.k1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_searchPosts, new bi.j0(this, 6));
        return true;
    }

    @Override
    public final boolean r(int i7) {
        return false;
    }

    public l6(int i7, TL_stories.MediaArea mediaArea) {
        super(i7, 0L, 3, -1, null);
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
