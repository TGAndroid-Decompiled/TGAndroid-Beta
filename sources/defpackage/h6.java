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
public final class h6 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public h6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        Message message;
        int i;
        int i2;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        yv6 yv6Var;
        yv6 yv6Var2;
        boolean z;
        int i3;
        yv6 yv6Var3;
        int i4 = -1;
        Message message2 = null;
        j27 j27Var = null;
        message2 = null;
        int i5 = 0;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                ((g9) this.b).b();
                return;
            case 1:
                tc tcVar = (tc) this.b;
                if (view == tcVar.i && (message = tcVar.k) != null) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                tcVar.z.obtainMessage(1, tcVar.b).sendToTarget();
                return;
            case 2:
                g81 g81Var = (g81) this.b;
                j81 j81Var = g81Var.y;
                if (g81Var.n != null && j81Var.H) {
                    int i6 = -1;
                    int i7 = -1;
                    while (i5 < g81Var.d) {
                        h81 h81Var = (h81) g81Var.n.get(i5, null);
                        if (h81Var != null) {
                            if (i6 == -1) {
                                i6 = h81Var.h;
                            }
                            i7 = h81Var.h;
                        }
                        i5++;
                    }
                    if (i6 >= 0 && i7 >= 0) {
                        j81Var.Q = i6;
                        j81Var.R = i7;
                        j81Var.B0();
                        j81Var.r0();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                v21.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                return;
            case 4:
                oe2 oe2Var = (oe2) this.b;
                zu1 zu1Var = oe2Var.u1;
                n12 n12Var = new n12(zu1Var.getParentActivity(), zu1Var, false, false, false, zu1Var.getResourceProvider());
                oe2Var.R1 = n12Var;
                n12Var.n = true;
                n12Var.w1(ob6.M0(2131752104, null));
                n12 n12Var2 = oe2Var.R1;
                n12Var2.W3 = new he2(oe2Var);
                n12Var2.u1(1, false);
                oe2Var.R1.a1();
                oe2Var.R1.d2.g0();
                oe2Var.R1.show();
                oe2Var.S1 = new tt(oe2Var, oe2Var.getContext());
                in inVar = new in(oe2Var.getContext(), true, true, true);
                oe2Var.T1 = inVar;
                inVar.setTextSize(hl.L(14.0f));
                oe2Var.T1.setText(ob6.M0(2131745265, null));
                oe2Var.T1.setGravity(17);
                in inVar2 = oe2Var.T1;
                int i8 = aob.Fi;
                yob.U(inVar2, i8, oe2Var.J0);
                oe2Var.S1.addView(oe2Var.T1, tre.e(-1, -2, 17));
                tt ttVar = oe2Var.S1;
                int L = hl.L(0.0f);
                int i9 = aob.d6;
                int v0 = aob.v0(i9, oe2Var.J0);
                int o = vm2.o(aob.v0(i8, oe2Var.J0), 76);
                yob.R(ttVar, aob.i0(L, L, L, L, v0, o, o), yob.M(i9), yob.g(i8, 76), oe2Var.J0);
                oe2Var.S1.setOnClickListener(new zd2(oe2Var, (byte) 0));
                oe2Var.R1.o3.addView(oe2Var.S1, tre.e(-1, -2, 80));
                return;
            case 5:
                boolean[] zArr = new boolean[1];
                o14 o14Var = (o14) this.b;
                o24 o24Var = o14Var.G;
                z8d z8dVar = new z8d(o24Var.getContext(), (vnb) null);
                LinearLayout linearLayout = new LinearLayout(o24Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(hl.L(21.0f), 0, hl.L(21.0f), 0);
                ImageView imageView = new ImageView(o24Var.getContext());
                imageView.setImageResource(2131232752);
                linearLayout.addView(imageView, tre.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(o24Var.getContext());
                qd4.u(15.0f, 2131751129, 1, textView, null);
                yob.X(textView, aob.n5, o24Var.a2);
                int i10 = 3;
                if (ob6.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                textView.setGravity(i);
                textView.setTypeface(hl.o());
                linearLayout.addView(textView, tre.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(o24Var.getContext());
                textView2.setText(hl.S2(ob6.M0(2131751128, null)));
                textView2.setTextSize(1, 15.0f);
                yob.X(textView2, aob.j5, o24Var.a2);
                if (ob6.a0) {
                    i2 = 5;
                } else {
                    i2 = 3;
                }
                textView2.setGravity(i2);
                linearLayout.addView(textView2, tre.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(o24Var.getContext());
                Object obj = o14Var.x;
                if (obj == null) {
                    obj = o24Var.X0;
                }
                textView3.setText(ob6.a0("EmojiSuggestionsUrl", null, 2131751127, obj));
                textView3.setTextSize(1, 15.0f);
                yob.X(textView3, aob.k5, o24Var.a2);
                if (ob6.a0) {
                    i10 = 5;
                }
                textView3.setGravity(i10);
                linearLayout.addView(textView3, tre.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new l14(this, zArr, z8dVar));
                ((nx0) z8dVar.b).O = linearLayout;
                z8dVar.o1();
                return;
            case 6:
                if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = ((jm4) this.b).K) != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                    return;
                }
                return;
            case 7:
                zc5 zc5Var = (zc5) view;
                boolean z3 = zc5Var.E;
                lt5 lt5Var = (lt5) this.b;
                if (z3) {
                    lt5Var.d2 = null;
                    lt5Var.Z1.l(zc5Var.getUid());
                    lt5Var.O1.b(zc5Var);
                    lt5Var.O0(true);
                    hl.V3(lt5Var.n1);
                    return;
                }
                zc5 zc5Var2 = lt5Var.d2;
                if (zc5Var2 != null) {
                    zc5Var2.a();
                }
                lt5Var.d2 = zc5Var;
                zc5Var.b();
                return;
            case 8:
                ((i56) this.b).e.callOnClick();
                return;
            case 9:
                ((lv6) this.b).dismiss();
                return;
            case 10:
                ov6 ov6Var = (ov6) this.b;
                wv6 wv6Var = ov6Var.y;
                if (wv6Var.N != null) {
                    wv6Var.I.removeMessages(2);
                }
                wv6Var.N = ov6Var.v;
                boolean isActivated = view.isActivated();
                boolean z4 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) wv6Var.O.get(ov6Var.v.c);
                    if (num == null) {
                        i5 = 1;
                    } else {
                        i5 = Math.max(1, num.intValue());
                    }
                }
                ov6Var.u(z4);
                ov6Var.x.setProgress(i5);
                ov6Var.v.j(i5);
                wv6Var.I.sendEmptyMessageDelayed(2, 500L);
                return;
            case 11:
                pv6 pv6Var = (pv6) this.b;
                lw6 lw6Var = pv6Var.B.x.f;
                jw6 jw6Var = pv6Var.A;
                lw6Var.getClass();
                if (jw6Var != null) {
                    lw6.b();
                    a05 c = lw6.c();
                    if (c.e instanceof zv6) {
                        v34 b = c.d.b(jw6Var);
                        if (b != null && (yv6Var = (yv6) b.b) != null && yv6Var.e) {
                            ((zv6) c.e).o(Collections.singletonList(jw6Var.b));
                        } else {
                            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                        }
                        pv6Var.w.setVisibility(4);
                        pv6Var.x.setVisibility(0);
                        return;
                    }
                    grb.i("There is no currently selected dynamic group route.");
                    return;
                }
                p3d.h("route must not be null");
                return;
            case 12:
                tv6 tv6Var = (tv6) this.b;
                boolean v = tv6Var.v(tv6Var.v);
                boolean z5 = !v;
                boolean e = tv6Var.v.e();
                uv6 uv6Var = tv6Var.I;
                if (!v) {
                    lw6 lw6Var2 = uv6Var.x.f;
                    jw6 jw6Var2 = tv6Var.v;
                    lw6Var2.getClass();
                    if (jw6Var2 != null) {
                        lw6.b();
                        a05 c2 = lw6.c();
                        if (c2.e instanceof zv6) {
                            v34 b2 = c2.d.b(jw6Var2);
                            if (!DesugarCollections.unmodifiableList(c2.d.v).contains(jw6Var2) && b2 != null && (yv6Var3 = (yv6) b2.b) != null && yv6Var3.d) {
                                ((zv6) c2.e).m(jw6Var2.b);
                            } else {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + jw6Var2);
                            }
                        } else {
                            grb.i("There is no currently selected dynamic group route.");
                            return;
                        }
                    } else {
                        p3d.h("route must not be null");
                        return;
                    }
                } else {
                    lw6 lw6Var3 = uv6Var.x.f;
                    jw6 jw6Var3 = tv6Var.v;
                    lw6Var3.getClass();
                    if (jw6Var3 != null) {
                        lw6.b();
                        a05 c3 = lw6.c();
                        if (c3.e instanceof zv6) {
                            v34 b3 = c3.d.b(jw6Var3);
                            if (DesugarCollections.unmodifiableList(c3.d.v).contains(jw6Var3) && b3 != null && ((yv6Var2 = (yv6) b3.b) == null || yv6Var2.c)) {
                                if (DesugarCollections.unmodifiableList(c3.d.v).size() <= 1) {
                                    Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                                } else {
                                    ((zv6) c3.e).n(jw6Var3.b);
                                }
                            } else {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + jw6Var3);
                            }
                        } else {
                            grb.i("There is no currently selected dynamic group route.");
                            return;
                        }
                    } else {
                        p3d.h("route must not be null");
                        return;
                    }
                }
                tv6Var.w(z5, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(uv6Var.x.r.v);
                    for (jw6 jw6Var4 : DesugarCollections.unmodifiableList(tv6Var.v.v)) {
                        if (unmodifiableList.contains(jw6Var4) != z5) {
                            ov6 ov6Var2 = (ov6) uv6Var.x.M.get(jw6Var4.c);
                            if (ov6Var2 instanceof tv6) {
                                ((tv6) ov6Var2).w(z5, true);
                            }
                        }
                    }
                }
                wv6 wv6Var2 = uv6Var.x;
                jw6 jw6Var5 = tv6Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(wv6Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (jw6Var5.e()) {
                    for (jw6 jw6Var6 : DesugarCollections.unmodifiableList(jw6Var5.v)) {
                        if (unmodifiableList2.contains(jw6Var6) != z5) {
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
                if (wv6Var2.j0 && DesugarCollections.unmodifiableList(wv6Var2.r.v).size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = (!wv6Var2.j0 || max < 2) ? false : false;
                if (z != z2) {
                    f89 L2 = wv6Var2.J.L(0);
                    if (L2 instanceof qv6) {
                        qv6 qv6Var = (qv6) L2;
                        View view2 = qv6Var.a;
                        if (z2) {
                            i5 = qv6Var.A;
                        }
                        uv6Var.D(i5, view2);
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
                if (((yaa) this.b).a.getImageReceiver().y() != null && !((yaa) this.b).a.getImageReceiver().y().l0) {
                    ((yaa) this.b).a.getImageReceiver().y().I(0, false, false);
                    ((yaa) this.b).a.getImageReceiver().y().C(false);
                    return;
                }
                return;
            case 15:
                m01.u((Activity) this.b, ob6.M0(2131744912, null));
                return;
            case 16:
                exb exbVar = ((Toolbar) this.b).f0;
                if (exbVar != null) {
                    j27Var = exbVar.b;
                }
                if (j27Var != null) {
                    j27Var.collapseActionView();
                    return;
                }
                return;
            default:
                ((tzb) this.b).L0(true);
                return;
        }
    }
}
