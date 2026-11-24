package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
public final class u3b extends z3b {
    public final String C;
    public final String D;
    public final TL_stories.MediaArea E;
    public final ArrayList F;
    public boolean G;
    public String H;
    public int I;
    public int J;

    public u3b(int i, String str, String str2) {
        super(i, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = str2;
        this.D = str;
        this.E = null;
    }

    @Override
    public final k47 f(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.i;
            if (i < arrayList.size()) {
                return (k47) arrayList.get(i);
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
        return this.i.size();
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
    public final boolean q(int i, List list, boolean z) {
        if (this.G || this.H == null) {
            return false;
        }
        TL_stories.TL_stories_searchPosts tL_stories_searchPosts = new TL_stories.TL_stories_searchPosts();
        tL_stories_searchPosts.offset = this.H;
        tL_stories_searchPosts.limit = i;
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
        int i2 = this.c;
        if (!isEmpty) {
            TLObject b2 = oc7.r1(i2).b2(str2);
            if (b2 == null) {
                oc7.r1(i2).Z1().a(str2, null, new b42(this, z, i, list));
                return true;
            }
            tLObject = b2;
        }
        if (tLObject != null) {
            tL_stories_searchPosts.flags |= 4;
            tL_stories_searchPosts.peer = oc7.j1(tLObject);
        }
        this.I = ConnectionsManager.getInstance(i2).sendRequest(tL_stories_searchPosts, new go9(this, (byte) 10));
        return true;
    }

    @Override
    public final boolean r(int i) {
        return false;
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

    public u3b(int i, TL_stories.MediaArea mediaArea) {
        super(i, 0L, 3, -1, null);
        this.F = new ArrayList();
        this.H = "";
        this.C = null;
        this.D = null;
        this.E = mediaArea;
    }
}
