package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_agent;
public final class uc extends q59 {
    public final ad c;

    public uc(ad adVar) {
        this.c = adVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.S.size();
    }

    @Override
    public final int d(int i) {
        return ((xc) this.c.S.get(i)).a;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        TL_agent.agentModel agentmodel;
        String str;
        int i2;
        ad adVar = this.c;
        xc xcVar = (xc) adVar.S.get(i);
        View view = u69Var.a;
        if ((view instanceof zc) && (agentmodel = xcVar.b) != null) {
            String str2 = adVar.M;
            if (str2 == null) {
                TL_agent.settings settingsVar = adVar.y.d;
                if (settingsVar != null) {
                    str2 = settingsVar.model;
                } else {
                    str2 = null;
                }
            }
            zc zcVar = (zc) view;
            boolean equals = TextUtils.equals(agentmodel.id, str2);
            zcVar.a.setText(agentmodel.name);
            boolean isEmpty = TextUtils.isEmpty(agentmodel.description);
            TextView textView = zcVar.b;
            if (!isEmpty) {
                str = agentmodel.description;
            } else {
                str = agentmodel.id;
            }
            textView.setText(str);
            ImageView imageView = zcVar.c;
            if (equals) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            imageView.setVisibility(i2);
        } else if (xcVar.a == 3 && (view instanceof TextView)) {
            ((TextView) view).setText(xcVar.c);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        int i2 = cmb.D8;
        ad adVar = this.c;
        int p1 = cmb.p1(0.5f, cmb.v0(i2, adVar.d));
        int i3 = 55;
        if (i == 0) {
            view = new zc(adVar, context);
        } else if (i == 1) {
            view = new yc(adVar, context);
        } else {
            int i4 = 5;
            if (i == 3) {
                TextView textView = new TextView(context);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(gm.o());
                textView.setTextColor(p1);
                textView.setSingleLine();
                if (!jb6.a0) {
                    i4 = 3;
                }
                textView.setGravity(i4 | 80);
                textView.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(3.0f));
                i3 = 26;
                view = textView;
            } else {
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(p1);
                if (!jb6.a0) {
                    i4 = 3;
                }
                textView2.setGravity(i4 | 16);
                textView2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                textView2.setText(jb6.M0(2131754282, null));
                i3 = 48;
                view = textView2;
            }
        }
        view.setLayoutParams(new g69(-1, gm.L(i3)));
        return new u69(view);
    }
}
