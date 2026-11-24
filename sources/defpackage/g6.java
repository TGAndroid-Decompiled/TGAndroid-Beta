package defpackage;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class g6 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public g6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        Message message;
        int i;
        int i2;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        tv6 tv6Var;
        tv6 tv6Var2;
        boolean z;
        int i3;
        tv6 tv6Var3;
        int i4 = -1;
        Message message2 = null;
        c27 c27Var = null;
        message2 = null;
        int i5 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                ((f9) this.b).b();
                return;
            case 1:
                sd sdVar = (sd) this.b;
                if (view == sdVar.i && (message = sdVar.k) != null) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                sdVar.z.obtainMessage(1, sdVar.b).sendToTarget();
                return;
            case 2:
                h91 h91Var = (h91) this.b;
                k91 k91Var = h91Var.y;
                if (h91Var.n != null && k91Var.H) {
                    int i6 = -1;
                    int i7 = -1;
                    while (i5 < h91Var.d) {
                        i91 i91Var = (i91) h91Var.n.get(i5, null);
                        if (i91Var != null) {
                            if (i6 == -1) {
                                i6 = i91Var.h;
                            }
                            i7 = i91Var.h;
                        }
                        i5++;
                    }
                    if (i6 >= 0 && i7 >= 0) {
                        k91Var.Q = i6;
                        k91Var.R = i7;
                        k91Var.B0();
                        k91Var.s0();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                u31.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                return;
            case 4:
                if2 if2Var = (if2) this.b;
                yv1 yv1Var = if2Var.u1;
                i22 i22Var = new i22(yv1Var.getParentActivity(), yv1Var, false, false, false, yv1Var.getResourceProvider());
                if2Var.R1 = i22Var;
                i22Var.n = true;
                i22Var.v1(jb6.M0(2131752076, null));
                i22 i22Var2 = if2Var.R1;
                i22Var2.W3 = new bf2(if2Var);
                i22Var2.t1(1, false);
                if2Var.R1.Z0();
                if2Var.R1.d2.h0();
                if2Var.R1.show();
                if2Var.S1 = new su(if2Var, if2Var.getContext());
                io ioVar = new io(if2Var.getContext(), true, true, true);
                if2Var.T1 = ioVar;
                ioVar.setTextSize(gm.L(14.0f));
                if2Var.T1.setText(jb6.M0(2131745271, null));
                if2Var.T1.setGravity(17);
                io ioVar2 = if2Var.T1;
                int i8 = cmb.Ei;
                anb.U(ioVar2, i8, if2Var.J0);
                if2Var.S1.addView(if2Var.T1, qoe.e(-1, -2, 17));
                su suVar = if2Var.S1;
                int L = gm.L(0.0f);
                int i9 = cmb.c6;
                int v0 = cmb.v0(i9, if2Var.J0);
                int p = on2.p(cmb.v0(i8, if2Var.J0), 76);
                anb.R(suVar, cmb.i0(L, L, L, L, v0, p, p), anb.M(i9), anb.g(i8, 76), if2Var.J0);
                if2Var.S1.setOnClickListener(new se2(if2Var, (byte) 0));
                if2Var.R1.o3.addView(if2Var.S1, qoe.e(-1, -2, 80));
                return;
            case 5:
                boolean[] zArr = new boolean[1];
                e24 e24Var = (e24) this.b;
                e34 e34Var = e24Var.G;
                k6d k6dVar = new k6d(e34Var.getContext(), (ylb) null);
                LinearLayout linearLayout = new LinearLayout(e34Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
                ImageView imageView = new ImageView(e34Var.getContext());
                imageView.setImageResource(2131232753);
                linearLayout.addView(imageView, qoe.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(e34Var.getContext());
                td4.v(15.0f, 2131751101, 1, textView, null);
                anb.X(textView, cmb.m5, e34Var.a2);
                int i10 = 3;
                if (jb6.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                textView.setGravity(i);
                textView.setTypeface(gm.o());
                linearLayout.addView(textView, qoe.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(e34Var.getContext());
                textView2.setText(gm.S2(jb6.M0(2131751100, null)));
                textView2.setTextSize(1, 15.0f);
                anb.X(textView2, cmb.i5, e34Var.a2);
                if (jb6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView2.setGravity(i2);
                linearLayout.addView(textView2, qoe.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(e34Var.getContext());
                Object obj = e24Var.x;
                if (obj == null) {
                    obj = e34Var.X0;
                }
                textView3.setText(jb6.a0("EmojiSuggestionsUrl", null, 2131751099, obj));
                textView3.setTextSize(1, 15.0f);
                anb.X(textView3, cmb.j5, e34Var.a2);
                if (jb6.a0) {
                    i10 = 5;
                }
                textView3.setGravity(i10);
                linearLayout.addView(textView3, qoe.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new b24(this, zArr, k6dVar));
                ((my0) k6dVar.b).O = linearLayout;
                k6dVar.h1();
                return;
            case 6:
                if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = ((fm4) this.b).K) != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                    return;
                }
                return;
            case 7:
                wc5 wc5Var = (wc5) view;
                boolean z3 = wc5Var.E;
                it5 it5Var = (it5) this.b;
                if (z3) {
                    it5Var.d2 = null;
                    it5Var.Z1.l(wc5Var.getUid());
                    it5Var.O1.b(wc5Var);
                    it5Var.N0(true);
                    gm.V3(it5Var.n1);
                    return;
                }
                wc5 wc5Var2 = it5Var.d2;
                if (wc5Var2 != null) {
                    wc5Var2.a();
                }
                it5Var.d2 = wc5Var;
                wc5Var.b();
                return;
            case 8:
                ((f56) this.b).e.callOnClick();
                return;
            case 9:
                ((gv6) this.b).dismiss();
                return;
            case 10:
                jv6 jv6Var = (jv6) this.b;
                rv6 rv6Var = jv6Var.y;
                if (rv6Var.N != null) {
                    rv6Var.I.removeMessages(2);
                }
                rv6Var.N = jv6Var.v;
                boolean isActivated = view.isActivated();
                boolean z4 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) rv6Var.O.get(jv6Var.v.c);
                    if (num == null) {
                        i5 = 1;
                    } else {
                        i5 = Math.max(1, num.intValue());
                    }
                }
                jv6Var.u(z4);
                jv6Var.x.setProgress(i5);
                jv6Var.v.j(i5);
                rv6Var.I.sendEmptyMessageDelayed(2, 500L);
                return;
            case 11:
                kv6 kv6Var = (kv6) this.b;
                gw6 gw6Var = kv6Var.B.x.f;
                ew6 ew6Var = kv6Var.A;
                gw6Var.getClass();
                if (ew6Var != null) {
                    gw6.b();
                    wz4 c = gw6.c();
                    if (c.e instanceof uv6) {
                        k44 b = c.d.b(ew6Var);
                        if (b != null && (tv6Var = (tv6) b.b) != null && tv6Var.e) {
                            ((uv6) c.e).o(Collections.singletonList(ew6Var.b));
                        } else {
                            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                        }
                        kv6Var.w.setVisibility(4);
                        kv6Var.x.setVisibility(0);
                        return;
                    }
                    dq9.m("There is no currently selected dynamic group route.");
                    return;
                }
                gxc.d("route must not be null");
                return;
            case 12:
                ov6 ov6Var = (ov6) this.b;
                boolean v = ov6Var.v(ov6Var.v);
                boolean z5 = !v;
                boolean e = ov6Var.v.e();
                pv6 pv6Var = ov6Var.I;
                if (!v) {
                    gw6 gw6Var2 = pv6Var.x.f;
                    ew6 ew6Var2 = ov6Var.v;
                    gw6Var2.getClass();
                    if (ew6Var2 != null) {
                        gw6.b();
                        wz4 c2 = gw6.c();
                        if (c2.e instanceof uv6) {
                            k44 b2 = c2.d.b(ew6Var2);
                            if (!DesugarCollections.unmodifiableList(c2.d.v).contains(ew6Var2) && b2 != null && (tv6Var3 = (tv6) b2.b) != null && tv6Var3.d) {
                                ((uv6) c2.e).m(ew6Var2.b);
                            } else {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + ew6Var2);
                            }
                        } else {
                            dq9.m("There is no currently selected dynamic group route.");
                            return;
                        }
                    } else {
                        gxc.d("route must not be null");
                        return;
                    }
                } else {
                    gw6 gw6Var3 = pv6Var.x.f;
                    ew6 ew6Var3 = ov6Var.v;
                    gw6Var3.getClass();
                    if (ew6Var3 != null) {
                        gw6.b();
                        wz4 c3 = gw6.c();
                        if (c3.e instanceof uv6) {
                            k44 b3 = c3.d.b(ew6Var3);
                            if (DesugarCollections.unmodifiableList(c3.d.v).contains(ew6Var3) && b3 != null && ((tv6Var2 = (tv6) b3.b) == null || tv6Var2.c)) {
                                if (DesugarCollections.unmodifiableList(c3.d.v).size() <= 1) {
                                    Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                                } else {
                                    ((uv6) c3.e).n(ew6Var3.b);
                                }
                            } else {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + ew6Var3);
                            }
                        } else {
                            dq9.m("There is no currently selected dynamic group route.");
                            return;
                        }
                    } else {
                        gxc.d("route must not be null");
                        return;
                    }
                }
                ov6Var.w(z5, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(pv6Var.x.r.v);
                    for (ew6 ew6Var4 : DesugarCollections.unmodifiableList(ov6Var.v.v)) {
                        if (unmodifiableList.contains(ew6Var4) != z5) {
                            jv6 jv6Var2 = (jv6) pv6Var.x.M.get(ew6Var4.c);
                            if (jv6Var2 instanceof ov6) {
                                ((ov6) jv6Var2).w(z5, true);
                            }
                        }
                    }
                }
                rv6 rv6Var2 = pv6Var.x;
                ew6 ew6Var5 = ov6Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(rv6Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (ew6Var5.e()) {
                    for (ew6 ew6Var6 : DesugarCollections.unmodifiableList(ew6Var5.v)) {
                        if (unmodifiableList2.contains(ew6Var6) != z5) {
                            if (!v) {
                                i3 = 1;
                            } else {
                                i3 = -1;
                            }
                            max += i3;
                        }
                    }
                } else {
                    if (!v) {
                        i4 = 1;
                    }
                    max += i4;
                }
                if (rv6Var2.j0 && DesugarCollections.unmodifiableList(rv6Var2.r.v).size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = (!rv6Var2.j0 || max < 2) ? false : false;
                if (z != z2) {
                    u69 K = rv6Var2.J.K(0);
                    if (K instanceof lv6) {
                        lv6 lv6Var = (lv6) K;
                        View view2 = lv6Var.a;
                        if (z2) {
                            i5 = lv6Var.A;
                        }
                        pv6Var.D(i5, view2);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.b;
                AnimationDrawable animationDrawable = mediaRouteExpandCollapseButton.e;
                AnimationDrawable animationDrawable2 = mediaRouteExpandCollapseButton.d;
                boolean z6 = mediaRouteExpandCollapseButton.n;
                mediaRouteExpandCollapseButton.n = !z6;
                if (!z6) {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable2);
                    animationDrawable2.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.h);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable);
                    animationDrawable.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.r;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 14:
                if (((i9a) this.b).a.getImageReceiver().y() != null && !((i9a) this.b).a.getImageReceiver().y().l0) {
                    ((i9a) this.b).a.getImageReceiver().y().I(0, false, false);
                    ((i9a) this.b).a.getImageReceiver().y().C(false);
                    return;
                }
                return;
            case 15:
                l11.u((Activity) this.b, jb6.M0(2131744944, null));
                return;
            case 16:
                evb evbVar = ((Toolbar) this.b).f0;
                if (evbVar != null) {
                    c27Var = evbVar.b;
                }
                if (c27Var != null) {
                    c27Var.collapseActionView();
                    return;
                }
                return;
            default:
                ((sxb) this.b).L0(true);
                return;
        }
    }
}
