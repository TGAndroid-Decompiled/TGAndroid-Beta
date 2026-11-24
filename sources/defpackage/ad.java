package defpackage;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;
public final class ad extends dc {
    public final wc E;
    public String F;
    public final ArrayList G;
    public String H;
    public String I;
    public boolean J;
    public boolean K;
    public int L;
    public String M;
    public final ArrayList N;
    public String O;
    public boolean P;
    public final ArrayList Q;
    public final b1 R;
    public final ArrayList S;
    public final mc y;

    public ad(int i, View view, sm2 sm2Var, ylb ylbVar) {
        super(i, view, sm2Var, ylbVar);
        this.G = new ArrayList();
        this.H = "";
        this.L = -1;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.R = new b1(this, (byte) 8);
        this.S = new ArrayList();
        this.y = mc.c(i);
        wc wcVar = new wc(this, view.getContext());
        this.E = wcVar;
        this.f.a(wcVar, qoe.o(264, -2));
    }

    public static TL_agent.agentModel e(String str, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (TextUtils.equals(((TL_agent.agentModel) arrayList.get(i)).id, str)) {
                return (TL_agent.agentModel) arrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public final int getMenuAnchorTint() {
        int i = tc.h;
        return cmb.p1(0.06f, cmb.v0(cmb.Ke, this.d));
    }

    @Override
    public final int getMenuDimAlpha() {
        return 51;
    }

    public final void j(boolean z) {
        String str;
        wc wcVar = this.E;
        String str2 = null;
        if (z) {
            gm.r(this.R);
            if (this.L >= 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.L, true);
                this.L = -1;
            }
            ArrayList arrayList = this.G;
            arrayList.clear();
            this.I = null;
            this.J = false;
            this.K = false;
            if (TextUtils.isEmpty(this.H)) {
                ArrayList arrayList2 = this.N;
                if (!arrayList2.isEmpty()) {
                    arrayList.addAll(arrayList2);
                    this.I = this.O;
                    this.J = this.P;
                    wcVar.c();
                    return;
                }
            }
        }
        if (!this.K && !this.J && (str = this.F) != null) {
            this.K = true;
            String str3 = this.H;
            String str4 = this.I;
            lf2 lf2Var = new lf2(this, str3, (byte) 2);
            mc mcVar = this.y;
            mcVar.getClass();
            TL_agent.getModels getmodels = new TL_agent.getModels();
            getmodels.provider = str;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            getmodels.query = str3;
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            getmodels.offset = str2;
            getmodels.limit = 20;
            this.L = ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(getmodels, new kc((byte) 0), lf2Var);
            wcVar.c();
        }
    }
}
