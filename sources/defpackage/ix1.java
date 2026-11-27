package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ix1 extends b8a {
    public final ChatActivityEnterView H;

    public ix1(ChatActivityEnterView chatActivityEnterView, final Context context, final zu1 zu1Var, uc7 uc7Var, final boolean z, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ie ieVar, vnb vnbVar) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = (short) 150;
        this.f = -1L;
        this.j = new pn(null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        d26 d26Var = new d26((byte) 22, context, this);
        this.t = d26Var;
        d26Var.setLayoutParams(tre.c(-2.0f, -2));
        setContentView(d26Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232583).mutate();
        yob.x(d26Var, mutate, aob.G8, vnbVar, PorterDuff.Mode.MULTIPLY);
        d26Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        d26Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = hl.L(450.0f);
        if (zu1Var == null) {
            width = hl.q.x;
        } else {
            width = zu1Var.m1.getWidth();
        }
        int i = (int) (width * 0.75f);
        v7a v7aVar = new v7a(context, i, L);
        this.o = v7aVar;
        v7aVar.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        yob.X(textView, aob.m5, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(ob6.M0(2131745328, null));
        textView.setTypeface(hl.o(), 1);
        int L2 = hl.L(18.0f);
        textView.setPadding(L2, hl.L(12.0f), L2, hl.L(12.0f));
        v7aVar.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        d79 d79Var = new d79(context, null);
        this.v = d79Var;
        x46 x46Var = new x46();
        this.w = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setAdapter(new w7a(vnbVar, arrayList, uc7Var, i, peer));
        d79Var.j(new x7a(this));
        d79Var.setOnItemClickListener(new r69(arrayList, context, zu1Var, z, ieVar) {
            public final List b;
            public final Context c;
            public final zu1 d;
            public final ie e;

            {
                this.e = ieVar;
            }

            @Override
            public final void e(int i2, View view) {
                ix1.this.k(this.b, this.c, this.d, this.e, view, i2);
            }
        });
        d79Var.setOverScrollMode(2);
        frameLayout.addView(d79Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(2131231240);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, tre.c(4.0f, -1));
        v7aVar.addView(frameLayout, tre.c(-2.0f, -1));
        d26Var.addView(v7aVar);
    }

    @Override
    public final void dismiss() {
        ArrayList arrayList = this.z;
        ChatActivityEnterView chatActivityEnterView = this.H;
        if (chatActivityEnterView.r0 != this) {
            super.dismiss();
            return;
        }
        chatActivityEnterView.r0 = null;
        int i = 0;
        if (!this.q) {
            l(new vpa[0]);
            chatActivityEnterView.q0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((vpa) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
