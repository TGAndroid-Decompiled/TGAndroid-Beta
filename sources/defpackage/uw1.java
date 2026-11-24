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
public final class uw1 extends j4a {
    public final ChatActivityEnterView H;

    public uw1(ChatActivityEnterView chatActivityEnterView, final Context context, final mu1 mu1Var, na7 na7Var, final boolean z, TLRPC.Peer peer, TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers, final ie ieVar, wjb wjbVar) {
        super(context);
        int width;
        this.H = chatActivityEnterView;
        this.b = true;
        this.c = (short) 150;
        this.f = -1L;
        this.j = new on(null);
        e();
        this.z = new ArrayList();
        this.G = new ArrayList();
        this.r = peer;
        this.s = tL_channels_sendAsPeers;
        oc6 oc6Var = new oc6((byte) 20, context, this);
        this.t = oc6Var;
        oc6Var.setLayoutParams(nme.c(-2.0f, -2));
        setContentView(oc6Var);
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(null);
        Drawable mutate = context.getDrawable(2131232572).mutate();
        zkb.x(oc6Var, mutate, bkb.F8, wjbVar, PorterDuff.Mode.MULTIPLY);
        oc6Var.setBackground(mutate);
        Rect rect = new Rect();
        mutate.getPadding(rect);
        oc6Var.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        int L = gl.L(450.0f);
        if (mu1Var == null) {
            width = gl.q.x;
        } else {
            width = mu1Var.m1.getWidth();
        }
        int i = (int) (width * 0.75f);
        d4a d4aVar = new d4a(context, i, L);
        this.o = d4aVar;
        d4aVar.setOrientation(1);
        TextView textView = new TextView(context);
        this.p = textView;
        zkb.X(textView, bkb.l5, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131745408, null));
        textView.setTypeface(gl.o(), 1);
        int L2 = gl.L(18.0f);
        textView.setPadding(L2, gl.L(12.0f), L2, gl.L(12.0f));
        d4aVar.addView(textView);
        FrameLayout frameLayout = new FrameLayout(context);
        final ArrayList<TLRPC.TL_sendAsPeer> arrayList = tL_channels_sendAsPeers.peers;
        o39 o39Var = new o39(context, null);
        this.v = o39Var;
        t26 t26Var = new t26();
        this.w = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setAdapter(new e4a(wjbVar, arrayList, na7Var, i, peer));
        o39Var.j(new f4a(this));
        o39Var.setOnItemClickListener(new c39(arrayList, context, mu1Var, z, ieVar) {
            public final List b;
            public final Context c;
            public final mu1 d;
            public final ie e;

            {
                this.e = ieVar;
            }

            @Override
            public final void d(int i2, View view) {
                uw1.this.k(this.b, this.c, this.d, this.e, view, i2);
            }
        });
        o39Var.setOverScrollMode(2);
        frameLayout.addView(o39Var);
        View view = new View(context);
        this.u = view;
        Drawable drawable = context.getDrawable(2131231240);
        drawable.setAlpha(153);
        view.setBackground(drawable);
        view.setAlpha(0.0f);
        frameLayout.addView(view, nme.c(4.0f, -1));
        d4aVar.addView(frameLayout, nme.c(-2.0f, -1));
        oc6Var.addView(d4aVar);
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
            l(new yla[0]);
            chatActivityEnterView.q0.a(true, true, 0.0f);
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((yla) obj).d();
        }
        arrayList.clear();
        super.dismiss();
    }
}
