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
        tt6 tt6Var;
        tt6 tt6Var2;
        boolean z;
        int i3;
        tt6 tt6Var3;
        int i4 = -1;
        Message message2 = null;
        c07 c07Var = null;
        message2 = null;
        int i5 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                ((f9) this.b).b();
                return;
            case 1:
                sc scVar = (sc) this.b;
                if (view == scVar.i && (message = scVar.k) != null) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                scVar.z.obtainMessage(1, scVar.b).sendToTarget();
                return;
            case 2:
                y71 y71Var = (y71) this.b;
                b81 b81Var = y71Var.y;
                if (y71Var.n != null && b81Var.H) {
                    int i6 = -1;
                    int i7 = -1;
                    while (i5 < y71Var.d) {
                        z71 z71Var = (z71) y71Var.n.get(i5, null);
                        if (z71Var != null) {
                            if (i6 == -1) {
                                i6 = z71Var.h;
                            }
                            i7 = z71Var.h;
                        }
                        i5++;
                    }
                    if (i6 >= 0 && i7 >= 0) {
                        b81Var.Q = i6;
                        b81Var.R = i7;
                        b81Var.A0();
                        b81Var.r0();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                m21.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                return;
            case 4:
                xd2 xd2Var = (xd2) this.b;
                mu1 mu1Var = xd2Var.u1;
                x02 x02Var = new x02(mu1Var.getParentActivity(), mu1Var, false, false, false, mu1Var.getResourceProvider());
                xd2Var.R1 = x02Var;
                x02Var.n = true;
                x02Var.v1(k96.M0(2131752127, null));
                x02 x02Var2 = xd2Var.R1;
                x02Var2.W3 = new qd2(xd2Var);
                x02Var2.t1(1, false);
                xd2Var.R1.Z0();
                xd2Var.R1.d2.h0();
                xd2Var.R1.show();
                xd2Var.S1 = new st(xd2Var, xd2Var.getContext());
                hn hnVar = new hn(xd2Var.getContext(), true, true, true);
                xd2Var.T1 = hnVar;
                hnVar.setTextSize(gl.L(14.0f));
                xd2Var.T1.setText(k96.M0(2131745345, null));
                xd2Var.T1.setGravity(17);
                hn hnVar2 = xd2Var.T1;
                int i8 = bkb.Ei;
                zkb.U(hnVar2, i8, xd2Var.J0);
                xd2Var.S1.addView(xd2Var.T1, nme.e(-1, -2, 17));
                st stVar = xd2Var.S1;
                int L = gl.L(0.0f);
                int i9 = bkb.c6;
                int v0 = bkb.v0(i9, xd2Var.J0);
                int o = bm2.o(bkb.v0(i8, xd2Var.J0), 76);
                zkb.R(stVar, bkb.i0(L, L, L, L, v0, o, o), zkb.M(i9), zkb.g(i8, 76), xd2Var.J0);
                xd2Var.S1.setOnClickListener(new hd2(xd2Var, (byte) 0));
                xd2Var.R1.o3.addView(xd2Var.S1, nme.e(-1, -2, 80));
                return;
            case 5:
                boolean[] zArr = new boolean[1];
                t04 t04Var = (t04) this.b;
                t14 t14Var = t04Var.G;
                i4d i4dVar = new i4d(t14Var.getContext(), null);
                LinearLayout linearLayout = new LinearLayout(t14Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(gl.L(21.0f), 0, gl.L(21.0f), 0);
                ImageView imageView = new ImageView(t14Var.getContext());
                imageView.setImageResource(2131232741);
                linearLayout.addView(imageView, nme.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(t14Var.getContext());
                tb4.u(15.0f, 2131751152, 1, textView, null);
                zkb.X(textView, bkb.m5, t14Var.a2);
                int i10 = 3;
                if (k96.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                textView.setGravity(i);
                textView.setTypeface(gl.o());
                linearLayout.addView(textView, nme.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(t14Var.getContext());
                textView2.setText(gl.S2(k96.M0(2131751151, null)));
                textView2.setTextSize(1, 15.0f);
                zkb.X(textView2, bkb.i5, t14Var.a2);
                if (k96.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView2.setGravity(i2);
                linearLayout.addView(textView2, nme.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(t14Var.getContext());
                Object obj = t04Var.x;
                if (obj == null) {
                    obj = t14Var.X0;
                }
                textView3.setText(k96.a0("EmojiSuggestionsUrl", null, 2131751150, obj));
                textView3.setTextSize(1, 15.0f);
                zkb.X(textView3, bkb.j5, t14Var.a2);
                if (k96.a0) {
                    i10 = 5;
                }
                textView3.setGravity(i10);
                linearLayout.addView(textView3, nme.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new q04(this, zArr, i4dVar));
                ((fx0) i4dVar.a).O = linearLayout;
                i4dVar.M2();
                return;
            case 6:
                if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = ((ek4) this.b).K) != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                    return;
                }
                return;
            case 7:
                ya5 ya5Var = (ya5) view;
                boolean z3 = ya5Var.E;
                jr5 jr5Var = (jr5) this.b;
                if (z3) {
                    jr5Var.d2 = null;
                    jr5Var.Z1.l(ya5Var.getUid());
                    jr5Var.O1.b(ya5Var);
                    jr5Var.N0(true);
                    gl.V3(jr5Var.n1);
                    return;
                }
                ya5 ya5Var2 = jr5Var.d2;
                if (ya5Var2 != null) {
                    ya5Var2.a();
                }
                jr5Var.d2 = ya5Var;
                ya5Var.b();
                return;
            case 8:
                ((f36) this.b).e.callOnClick();
                return;
            case 9:
                ((gt6) this.b).dismiss();
                return;
            case 10:
                jt6 jt6Var = (jt6) this.b;
                rt6 rt6Var = jt6Var.y;
                if (rt6Var.N != null) {
                    rt6Var.I.removeMessages(2);
                }
                rt6Var.N = jt6Var.v;
                boolean isActivated = view.isActivated();
                boolean z4 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) rt6Var.O.get(jt6Var.v.c);
                    if (num == null) {
                        i5 = 1;
                    } else {
                        i5 = Math.max(1, num.intValue());
                    }
                }
                jt6Var.u(z4);
                jt6Var.x.setProgress(i5);
                jt6Var.v.j(i5);
                rt6Var.I.sendEmptyMessageDelayed(2, 500L);
                return;
            case 11:
                kt6 kt6Var = (kt6) this.b;
                gu6 gu6Var = kt6Var.B.x.f;
                eu6 eu6Var = kt6Var.A;
                gu6Var.getClass();
                if (eu6Var != null) {
                    gu6.b();
                    ux4 c = gu6.c();
                    if (c.e instanceof ut6) {
                        pj4 b = c.d.b(eu6Var);
                        if (b != null && (tt6Var = (tt6) b.b) != null && tt6Var.e) {
                            ((ut6) c.e).o(Collections.singletonList(eu6Var.b));
                        } else {
                            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                        }
                        kt6Var.w.setVisibility(4);
                        kt6Var.x.setVisibility(0);
                        return;
                    }
                    sc8.j("There is no currently selected dynamic group route.");
                    return;
                }
                fvc.f("route must not be null");
                return;
            case 12:
                ot6 ot6Var = (ot6) this.b;
                boolean v = ot6Var.v(ot6Var.v);
                boolean z5 = !v;
                boolean e = ot6Var.v.e();
                pt6 pt6Var = ot6Var.I;
                if (!v) {
                    gu6 gu6Var2 = pt6Var.x.f;
                    eu6 eu6Var2 = ot6Var.v;
                    gu6Var2.getClass();
                    if (eu6Var2 != null) {
                        gu6.b();
                        ux4 c2 = gu6.c();
                        if (c2.e instanceof ut6) {
                            pj4 b2 = c2.d.b(eu6Var2);
                            if (!DesugarCollections.unmodifiableList(c2.d.v).contains(eu6Var2) && b2 != null && (tt6Var3 = (tt6) b2.b) != null && tt6Var3.d) {
                                ((ut6) c2.e).m(eu6Var2.b);
                            } else {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + eu6Var2);
                            }
                        } else {
                            sc8.j("There is no currently selected dynamic group route.");
                            return;
                        }
                    } else {
                        fvc.f("route must not be null");
                        return;
                    }
                } else {
                    gu6 gu6Var3 = pt6Var.x.f;
                    eu6 eu6Var3 = ot6Var.v;
                    gu6Var3.getClass();
                    if (eu6Var3 != null) {
                        gu6.b();
                        ux4 c3 = gu6.c();
                        if (c3.e instanceof ut6) {
                            pj4 b3 = c3.d.b(eu6Var3);
                            if (DesugarCollections.unmodifiableList(c3.d.v).contains(eu6Var3) && b3 != null && ((tt6Var2 = (tt6) b3.b) == null || tt6Var2.c)) {
                                if (DesugarCollections.unmodifiableList(c3.d.v).size() <= 1) {
                                    Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                                } else {
                                    ((ut6) c3.e).n(eu6Var3.b);
                                }
                            } else {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + eu6Var3);
                            }
                        } else {
                            sc8.j("There is no currently selected dynamic group route.");
                            return;
                        }
                    } else {
                        fvc.f("route must not be null");
                        return;
                    }
                }
                ot6Var.w(z5, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(pt6Var.x.r.v);
                    for (eu6 eu6Var4 : DesugarCollections.unmodifiableList(ot6Var.v.v)) {
                        if (unmodifiableList.contains(eu6Var4) != z5) {
                            jt6 jt6Var2 = (jt6) pt6Var.x.M.get(eu6Var4.c);
                            if (jt6Var2 instanceof ot6) {
                                ((ot6) jt6Var2).w(z5, true);
                            }
                        }
                    }
                }
                rt6 rt6Var2 = pt6Var.x;
                eu6 eu6Var5 = ot6Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(rt6Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (eu6Var5.e()) {
                    for (eu6 eu6Var6 : DesugarCollections.unmodifiableList(eu6Var5.v)) {
                        if (unmodifiableList2.contains(eu6Var6) != z5) {
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
                if (rt6Var2.j0 && DesugarCollections.unmodifiableList(rt6Var2.r.v).size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = (!rt6Var2.j0 || max < 2) ? false : false;
                if (z != z2) {
                    s49 K = rt6Var2.J.K(0);
                    if (K instanceof lt6) {
                        lt6 lt6Var = (lt6) K;
                        View view2 = lt6Var.a;
                        if (z2) {
                            i5 = lt6Var.A;
                        }
                        pt6Var.D(i5, view2);
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
                if (((h7a) this.b).a.getImageReceiver().y() != null && !((h7a) this.b).a.getImageReceiver().y().l0) {
                    ((h7a) this.b).a.getImageReceiver().y().I(0, false, false);
                    ((h7a) this.b).a.getImageReceiver().y().C(false);
                    return;
                }
                return;
            case 15:
                d01.t((Activity) this.b, k96.M0(2131745018, null));
                return;
            case 16:
                dtb dtbVar = ((Toolbar) this.b).f0;
                if (dtbVar != null) {
                    c07Var = dtbVar.b;
                }
                if (c07Var != null) {
                    c07Var.collapseActionView();
                    return;
                }
                return;
            default:
                ((qvb) this.b).K0(true);
                return;
        }
    }
}
