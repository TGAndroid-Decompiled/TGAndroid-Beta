package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class xt5 extends fx0 {
    public static ArrayList C1;
    public static long D1;
    public static long E1;
    public static int F1;
    public boolean A1;
    public vt5 B1;
    public Drawable l1;
    public boolean m1;
    public int n1;
    public z92 o1;
    public tt5 p1;
    public TextView q1;
    public TextView r1;
    public ArrayList s1;
    public boolean t1;
    public int u1;
    public int v1;
    public TLRPC.Peer w1;
    public TLRPC.Peer x1;
    public TLRPC.InputPeer y1;
    public boolean z1;

    public static void D0(Activity activity, long j, j5 j5Var, sc7 sc7Var) {
        int i = F1;
        int i2 = j5Var.a;
        boolean z = true;
        if (i == i2 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 240000) {
            if (C1.size() != 1) {
                z = false;
            }
            sc7Var.k(z);
            return;
        }
        hd hdVar = new hd(3, null, activity);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = na7.q1(i2).h1(j);
        hdVar.setOnCancelListener(new qt5(j5Var, ConnectionsManager.getInstance(i2).sendRequest(getgroupcalljoinas, new ws0(hdVar, j, j5Var, sc7Var)), (byte) 1));
        try {
            hdVar.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void E0(Context context, long j, j5 j5Var, d dVar, int i, TLRPC.Peer peer, vt5 vt5Var) {
        if (context != null) {
            int i2 = F1;
            int i3 = j5Var.a;
            if (i2 == i3 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 300000) {
                if (C1.size() == 1 && i != 0) {
                    vt5Var.a(na7.q1(i3).h1(k27.B1((TLRPC.Peer) C1.get(0))), false, false, false);
                    return;
                } else {
                    F0(context, j, C1, dVar, i, peer, vt5Var);
                    return;
                }
            }
            hd hdVar = new hd(3, null, context);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = na7.q1(i3).h1(j);
            hdVar.setOnCancelListener(new qt5(j5Var, ConnectionsManager.getInstance(i3).sendRequest(getgroupcalljoinas, new mz4(hdVar, j5Var, vt5Var, j, context, dVar, i, peer)), (byte) 0));
            try {
                hdVar.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void F0(Context context, long j, ArrayList arrayList, d dVar, int i, TLRPC.Peer peer, vt5 vt5Var) {
        int i2;
        st5 st5Var;
        int i3;
        boolean z;
        int i4;
        int i5;
        if (i == 0) {
            if (!arrayList.isEmpty()) {
                o03 o03Var = new o03(dVar, arrayList, j, vt5Var);
                if (dVar.getParentActivity() != null) {
                    dVar.showDialog(o03Var);
                    return;
                } else {
                    o03Var.show();
                    return;
                }
            }
            return;
        }
        ?? fx0Var = new fx0(context, false);
        fx0Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        fx0Var.s1 = arrayList2;
        fx0Var.B1 = vt5Var;
        fx0Var.v1 = i;
        Drawable d = b00.d(context, 2131232733);
        fx0Var.l1 = d;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) fx0Var.s1.get(i6);
                    if (k27.B1(peer2) == selfId) {
                        fx0Var.x1 = peer2;
                        fx0Var.w1 = peer2;
                        break;
                    }
                    i6++;
                }
            } else if (peer != null) {
                long B1 = k27.B1(peer);
                int size2 = arrayList2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) fx0Var.s1.get(i7);
                    if (k27.B1(peer3) == B1) {
                        fx0Var.x1 = peer3;
                        fx0Var.w1 = peer3;
                        break;
                    }
                    i7++;
                }
            } else {
                fx0Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = fx0Var.l1;
            i2 = bkb.w0(null, bkb.Vg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        } else {
            int w0 = bkb.w0(null, bkb.g5, false);
            d.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            fx0Var.m1 = true;
            fx0Var.n1 = w0;
            fx0Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            i2 = w0;
        }
        fx0Var.L(i2);
        if (fx0Var.v1 == 0) {
            ?? rt5Var = new rt5(fx0Var, context);
            rt5Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(rt5Var);
            fx0Var.O = nestedScrollView;
            st5Var = rt5Var;
        } else {
            st5 st5Var2 = new st5(fx0Var, context);
            fx0Var.b = st5Var2;
            st5Var2.setWillNotDraw(false);
            ViewGroup viewGroup = fx0Var.b;
            int i8 = fx0Var.u0;
            viewGroup.setPadding(i8, 0, i8, 0);
            st5Var = st5Var2;
        }
        TLRPC.Chat K0 = na7.q1(fx0Var.a).K0(Long.valueOf(-j));
        tt5 tt5Var = new tt5(fx0Var, context);
        fx0Var.p1 = tt5Var;
        fx0Var.getContext();
        if (fx0Var.v1 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        tt5Var.setLayoutManager(new t26(i3, false));
        tt5Var.setAdapter(new wt5(fx0Var, context));
        tt5Var.setVerticalScrollBarEnabled(false);
        tt5Var.setClipToPadding(false);
        tt5Var.setEnabled(true);
        tt5Var.setSelectorDrawableColor(0);
        zkb.l(tt5Var, 21, bkb.z5, null);
        tt5Var.setOnScrollListener(new ut5(fx0Var));
        tt5Var.setOnItemClickListener(new k0(fx0Var, K0, (byte) 14));
        if (i != 0) {
            st5Var.addView(tt5Var, nme.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            tt5Var.setSelectorDrawableColor(0);
            tt5Var.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624323, 120, 120, null);
            imageView.d();
            st5Var.addView(imageView, nme.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        fx0Var.q1 = textView;
        ug8.v(textView, 1, 20.0f);
        if (i == 2) {
            zkb.X(textView, bkb.dh, null);
        } else {
            zkb.X(textView, bkb.i5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (hc2.W(K0)) {
                textView.setText(k96.M0(2131744666, null));
            } else {
                textView.setText(k96.M0(2131744663, null));
            }
            st5Var.addView(textView, nme.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                textView.setText(k96.M0(2131743144, null));
            } else if (hc2.W(K0)) {
                textView.setText(k96.M0(2131743234, null));
            } else {
                textView.setText(k96.M0(2131743126, null));
            }
            st5Var.addView(textView, nme.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(fx0Var.getContext());
        fx0Var.r1 = textView2;
        if (i == 2) {
            zkb.X(textView2, bkb.eh, null);
        } else {
            zkb.X(textView2, bkb.q5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = fx0Var.s1.size();
        for (int i9 = 0; i9 < size3; i9++) {
            long B12 = k27.B1((TLRPC.Peer) fx0Var.s1.get(i9));
            if (B12 < 0) {
                TLRPC.Chat K02 = na7.q1(fx0Var.a).K0(Long.valueOf(-B12));
                if (!hc2.T(K02) || K02.megagroup) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        fx0Var.r1.setMovementMethod(new cl((byte) 0));
        zkb.G(fx0Var.r1, bkb.j5, null);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            if (hc2.T(K0) && !K0.megagroup) {
                sb.append(k96.M0(2131743216, null));
            } else {
                sb.append(k96.M0(2131743091, null));
            }
            if (fx0Var.s1.size() > 1) {
                sb.append("\n\n");
                sb.append(k96.M0(2131743201, null));
            } else {
                fx0Var.p1.setVisibility(8);
            }
            fx0Var.r1.setText(sb);
            fx0Var.r1.setGravity(49);
            st5Var.addView(fx0Var.r1, nme.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            TextView textView3 = fx0Var.r1;
            if (z) {
                textView3.setText(k96.M0(2131743089, null));
            } else {
                textView3.setText(k96.M0(2131743090, null));
            }
            TextView textView4 = fx0Var.r1;
            if (k96.a0) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            textView4.setGravity(i4 | 48);
            st5Var.addView(fx0Var.r1, nme.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i == 0) {
            tt5 tt5Var2 = fx0Var.p1;
            if (fx0Var.s1.size() < 5) {
                i5 = -2;
            } else {
                i5 = -1;
            }
            st5Var.addView(tt5Var2, nme.t(i5, 95, 49, 0, 6, 0, 0));
        }
        z92 z92Var = new z92(fx0Var, context, false);
        fx0Var.o1 = z92Var;
        ((View) z92Var.d).setOnClickListener(new xf3((Object) fx0Var, vt5Var, (byte) 27));
        if (fx0Var.v1 == 0) {
            st5Var.addView(z92Var, nme.t(-1, 50, 51, 0, 0, 0, 0));
            z92 z92Var2 = new z92(fx0Var, context, true);
            if (hc2.W(K0)) {
                z92Var2.a(k96.M0(2131743220, null), false);
            } else {
                z92Var2.a(k96.M0(2131743099, null), false);
            }
            ((View) z92Var2.d).setOnClickListener(new b95(fx0Var, (byte) 11));
            st5Var.addView(z92Var2, nme.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            st5Var.addView(z92Var, nme.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        fx0Var.G0(K0, false);
        if (dVar != 0) {
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(fx0Var);
                return;
            }
            return;
        }
        fx0Var.show();
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void G0(TLRPC.Chat chat, boolean z) {
        String str;
        z92 z92Var = this.o1;
        if (this.v1 == 0) {
            if (hc2.W(chat)) {
                z92Var.a(k96.a0("VoipChannelStartVoiceChat", null, 2131743213, new Object[0]), z);
                return;
            } else {
                z92Var.a(k96.a0("VoipGroupStartVoiceChat", null, 2131743082, new Object[0]), z);
                return;
            }
        }
        long B1 = k27.B1(this.w1);
        boolean D = cf3.D(B1);
        int i = this.a;
        if (D) {
            z92Var.a(k96.a0("VoipGroupContinueAs", null, 2131743149, l7c.k(na7.q1(i).V1(Long.valueOf(B1)), true)), z);
            return;
        }
        TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-B1));
        if (K0 != null) {
            str = K0.title;
        } else {
            str = "";
        }
        z92Var.a(k96.a0("VoipGroupContinueAs", null, 2131743149, str), z);
    }

    public final void H0() {
        tt5 tt5Var = this.p1;
        if (this.v1 != 0) {
            if (tt5Var.getChildCount() <= 0) {
                int paddingTop = tt5Var.getPaddingTop();
                this.u1 = paddingTop;
                tt5Var.setTopGlowOffset(paddingTop);
                this.b.invalidate();
                return;
            }
            int i = 0;
            View childAt = tt5Var.getChildAt(0);
            y29 y29Var = (y29) tt5Var.G(childAt);
            int top = childAt.getTop() - gl.L(9.0f);
            if (top > 0 && y29Var != null && y29Var.b() == 0) {
                i = top;
            }
            if (this.u1 != i) {
                this.q1.setTranslationY(gl.L(19.0f) + top);
                this.r1.setTranslationY(gl.L(56.0f) + top);
                this.u1 = i;
                tt5Var.setTopGlowOffset(i);
                this.b.invalidate();
            }
        }
    }

    @Override
    public final void I() {
        super.I();
        TLRPC.InputPeer inputPeer = this.y1;
        if (inputPeer != null) {
            vt5 vt5Var = this.B1;
            boolean z = true;
            if (this.s1.size() <= 1) {
                z = false;
            }
            vt5Var.a(inputPeer, z, this.z1, false);
        }
    }

    @Override
    public final void p0() {
        Drawable drawable;
        super.p0();
        try {
            int w0 = bkb.w0(null, bkb.g5, false);
            if (this.m1 && (drawable = this.l1) != null && w0 != this.n1) {
                this.n1 = w0;
                drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
