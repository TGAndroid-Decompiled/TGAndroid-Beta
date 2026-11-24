package defpackage;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ProfileActivity;
public final class ao8 implements qac {
    public final byte a;
    public final ProfileActivity b;

    public ao8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void a(Object obj) {
        String r;
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                RectF rectF = ProfileActivity.e7;
                TL_agent.agentProvider d = profileActivity.getMessagesController().B0().d(str);
                TLRPC.User W1 = profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1));
                if (d != null) {
                    str = d.title;
                }
                if (W1 != null && m9c.p(W1) != null) {
                    r = "@" + m9c.p(W1);
                } else {
                    r = m9c.r(W1);
                }
                c41.b0(profileActivity).L(2131623990, jb6.a0(null, null, 2131754279, str), jb6.a0(null, null, 2131754278, r), jb6.M0(2131754274, null), new v56(profileActivity, (byte) 16)).j();
                return;
            case 1:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.e7;
                if (view instanceof hjb) {
                    hjb hjbVar = (hjb) view;
                    hjbVar.a.setLoading(profileActivity.t5);
                    hjbVar.b.setLoading(profileActivity.t5);
                    return;
                }
                return;
            case 2:
                RectF rectF3 = ProfileActivity.e7;
                profileActivity.y2((Boolean) obj);
                return;
            case 3:
                RectF rectF4 = ProfileActivity.e7;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity.showDialog(new az3(profileActivity, profileActivity.getParentActivity(), profileActivity.A0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                RectF rectF5 = ProfileActivity.e7;
                if (view2 instanceof jf5) {
                    ((jf5) view2).setTextColor(cmb.v0(cmb.K6, profileActivity.A0));
                } else if (view2 instanceof hjb) {
                    ((hjb) view2).updateColors();
                } else if (view2 instanceof xib) {
                    ((xib) view2).updateColors();
                } else if (view2 instanceof s1) {
                    ((s1) view2).updateColors();
                } else if (view2 instanceof yn7) {
                    ((yn7) view2).getCheckBox().invalidate();
                } else if (view2 instanceof dt8) {
                    dt8 dt8Var = (dt8) view2;
                    wj2 wj2Var = dt8Var.r;
                    int L = gm.L(8.0f);
                    int i = cmb.n6;
                    ylb ylbVar = dt8Var.a;
                    int p1 = cmb.p1(0.1f, cmb.v0(i, ylbVar));
                    int p12 = cmb.p1(0.22f, cmb.v0(i, ylbVar));
                    wj2Var.setBackground(cmb.i0(L, L, L, L, p1, p12, p12));
                    wj2Var.setTextColor(cmb.v0(i, ylbVar));
                } else if (view2 instanceof jr8) {
                    ((jr8) view2).updateColors();
                }
                lq8 lq8Var = profileActivity.d;
                profileActivity.a.getClass();
                lq8Var.d(RecyclerView.R(view2));
                profileActivity.d.getClass();
                return;
        }
    }
}
