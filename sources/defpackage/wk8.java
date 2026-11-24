package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.media.projection.MediaProjectionManager;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
public final class wk8 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public wk8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        qac qacVar;
        ll0 ll0Var;
        rh9 rh9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yk8 yk8Var = ((xk8) obj).y;
                if (yk8Var.r && (qacVar = yk8Var.f) != null) {
                    qacVar.a(5);
                    return;
                }
                return;
            case 1:
                PrivacyControlActivity privacyControlActivity = ((bm8) obj).d;
                privacyControlActivity.showDialog(new kj8((d) privacyControlActivity, 27, false));
                return;
            case 2:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                privacySettingsActivity.getClass();
                oh2 oh2Var = (oh2) view;
                int intValue = ((Integer) oh2Var.getTag()).intValue();
                boolean[] zArr = privacySettingsActivity.a0;
                boolean z = !zArr[intValue];
                zArr[intValue] = z;
                oh2Var.c(z, true);
                return;
            case 3:
                om8 om8Var = (om8) obj;
                if (!om8Var.a) {
                    if (om8Var.y == 0 && om8Var.E) {
                        ((Activity) om8Var.getContext()).startActivityForResult(((MediaProjectionManager) om8Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        om8Var.a(false, true);
                        return;
                    }
                }
                return;
            case 4:
                cic cicVar = (cic) obj;
                if (!cicVar.a) {
                    if (cicVar.x == 0) {
                        ((Activity) cicVar.getContext()).startActivityForResult(((MediaProjectionManager) cicVar.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        cicVar.a(false, true);
                        return;
                    }
                }
                return;
            case 5:
                ((ku8) obj).dismiss();
                return;
            case 6:
                zv8 zv8Var = (zv8) obj;
                ProxyListActivity proxyListActivity = zv8Var.s;
                fda fdaVar = zv8Var.d;
                ?? dVar = new d(null);
                dVar.e = new bba[3];
                dVar.f = new njb[2];
                dVar.s = new w09[3];
                dVar.E = 1.0f;
                dVar.F = new float[2];
                dVar.G = true;
                dVar.M = new cw8(dVar, (byte) 0);
                dVar.K = fdaVar;
                proxyListActivity.presentFragment((d) dVar);
                return;
            case 7:
                ((px8) obj).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 8:
                ca9 ca9Var = (ca9) obj;
                b61 b61Var = ca9Var.s;
                if (b61Var.e0 && !b61Var.R) {
                    b61Var.setLoading(true);
                    da9 da9Var = ca9Var.w;
                    CharSequence text = ((TextView) ca9Var.h.b).getText();
                    byte[] bArr = ca9Var.d.option;
                    String charSequence = ca9Var.n.getText().toString();
                    int i = da9.v1;
                    da9Var.K0(text, bArr, charSequence);
                    return;
                }
                return;
            case 9:
                aa9 aa9Var = (aa9) ((jp0) obj).e;
                if (aa9Var != null) {
                    aa9Var.run();
                    return;
                }
                return;
            case 10:
                ((ib9) obj).performClick();
                return;
            case 11:
                ((cd9) obj).dismiss();
                return;
            case 12:
                be9 be9Var = (be9) obj;
                lg9 lg9Var = be9Var.h;
                if (lg9Var != null && (ll0Var = be9Var.f) != null) {
                    ch9 ch9Var = lg9Var.a;
                    if (ch9.t3(ll0Var)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) ll0Var.b;
                        of9 of9Var = ch9Var.R3;
                        if (of9Var != null) {
                            of9Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        ch9Var.g3.O(true);
                        of9 of9Var2 = ch9Var.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                th9 th9Var = (th9) obj;
                ll0 ll0Var2 = th9Var.a;
                if (ll0Var2 != null && (rh9Var = th9Var.H) != null) {
                    ((yg9) rh9Var).a.p3.t(ll0Var2);
                    return;
                }
                return;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                    rr9 rr9Var = saveToGallerySettingsActivity.c;
                    l.put(rr9Var.d, rr9Var);
                    saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 15:
                ((vs9) obj).onBackPressed();
                return;
            case 16:
                ((m14) obj).f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
            case 17:
                ((ud5) obj).dismiss();
                return;
            case 18:
                ju9 ju9Var = (ju9) ((ny0) obj).d;
                Activity activity = ju9Var.G;
                d dVar2 = ju9Var.H;
                int i2 = p71.m1;
                if (dVar2 != null && activity != null) {
                    final p71 p71Var = new p71((byte) 1, activity, false);
                    p71Var.w0 = false;
                    p71Var.v0 = false;
                    int i3 = cmb.c6;
                    p71Var.L(i3);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, p71Var.J0), 1, -1));
                    anb.s(imageView, cmb.zj, p71Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231313);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r2;
                            p71 p71Var2 = p71Var;
                            switch (b2) {
                                case 0:
                                    p71Var2.dismiss();
                                    return;
                                default:
                                    p71Var2.dismiss();
                                    er3 q = er3.q(p71Var2.a);
                                    q.I.clear();
                                    q.getNotificationCenter().k(309, new Object[0]);
                                    q.getMessagesStorage().a.c(new br3(q, (byte) 2));
                                    return;
                            }
                        }
                    });
                    int L = gm.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, qoe.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    b1b b1bVar = new b1b(activity, p71Var.a);
                    b1bVar.setStickerNum(9);
                    b1bVar.getImageReceiver().M(1);
                    linearLayout.addView(b1bVar, qoe.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i4 = cmb.i5;
                    anb.X(textView, i4, null);
                    ts2.q(20.0f, 1, 2131751283, textView, null);
                    linearLayout.addView(textView, qoe.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    anb.X(textView2, i4, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(jb6.a0("DownloadedFilesMessage", null, 2131751282, new Object[0]));
                    linearLayout.addView(textView2, qoe.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(gm.o());
                    textView3.setText(jb6.M0(2131748454, null));
                    anb.X(textView3, cmb.Ii, null);
                    int L2 = gm.L(8.0f);
                    int i5 = cmb.Ei;
                    int w0 = cmb.w0(null, i5, false);
                    int p = on2.p(cmb.w0(null, i3, false), 120);
                    fg0 i0 = cmb.i0(L2, L2, L2, L2, w0, p, p);
                    wmb M = anb.M(i5);
                    wmb g = anb.g(i3, 120);
                    textView3.setBackground(i0);
                    anb.j(textView3, i0, M, g, null);
                    linearLayout.addView(textView3, qoe.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(gm.o());
                    textView4.setText(jb6.M0(2131752030, null));
                    anb.X(textView4, i5, null);
                    int L3 = gm.L(8.0f);
                    int p2 = on2.p(cmb.w0(null, i5, false), 120);
                    fg0 i02 = cmb.i0(L3, L3, L3, L3, 0, p2, p2);
                    wmb g2 = anb.g(i5, 120);
                    textView4.setBackground(i02);
                    anb.j(textView4, i02, null, g2, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, qoe.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    p71Var.O = nestedScrollView;
                    textView3.setOnClickListener(new tf3(p71Var, dVar2, (byte) 7));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r2;
                            p71 p71Var2 = p71Var;
                            switch (b2) {
                                case 0:
                                    p71Var2.dismiss();
                                    return;
                                default:
                                    p71Var2.dismiss();
                                    er3 q = er3.q(p71Var2.a);
                                    q.I.clear();
                                    q.getNotificationCenter().k(309, new Object[0]);
                                    q.getMessagesStorage().a.c(new br3(q, (byte) 2));
                                    return;
                            }
                        }
                    });
                    p71Var.show();
                    return;
                }
                return;
            case 19:
                vc vcVar = ((lu9) obj).d;
                vcVar.setText("");
                gm.E3(vcVar);
                return;
            case 20:
                new kj8(((xu9) obj).b, 24, true).show();
                return;
            case 21:
                ((vv9) obj).R(false);
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                k47 k47Var = secretMediaViewer.g0;
                if (k47Var != null) {
                    TLRPC.Message message = k47Var.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        hg5 hg5Var = secretMediaViewer.r;
                        if (hg5Var.W) {
                            hg5Var.f(true);
                            return;
                        } else {
                            secretMediaViewer.m();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 23:
                k0a k0aVar = (k0a) obj;
                if (k0aVar.V1 instanceof TLRPC.User) {
                    b61 b61Var2 = k0aVar.c2;
                    if (!b61Var2.R) {
                        b61Var2.setLoading(true);
                        k0aVar.Y0((TLRPC.User) k0aVar.V1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                Runnable runnable = ((e1a) obj).e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 25:
                q2a q2aVar = (q2a) obj;
                ok okVar = q2aVar.y1.a;
                ok okVar2 = ok.b;
                if (okVar == okVar2) {
                    okVar2 = ok.a;
                }
                q2aVar.E0(nk.j(0L, okVar2), true, false, true);
                q2aVar.m1.setText("");
                return;
            case 26:
                SessionsActivity sessionsActivity = ((i9a) obj).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    } else {
                        lb1.j0(sessionsActivity.getParentActivity(), 2, new g9a(sessionsActivity));
                        return;
                    }
                }
                return;
            case 27:
                bda bdaVar = (bda) ((pw3) obj).w;
                ArrayList arrayList = bdaVar.s;
                if (!arrayList.isEmpty()) {
                    bdaVar.r = TextUtils.join(" ", arrayList).toString();
                    bdaVar.n = false;
                    bdaVar.d();
                    bdaVar.x = null;
                    if (bdaVar.b != 0) {
                        bdaVar.b = (byte) 0;
                        ada adaVar = bdaVar.I;
                        if (adaVar != null) {
                            ((nh3) adaVar).f(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 28:
                d dVar3 = ((zfa) obj).f.y1;
                if (dVar3 != null && dVar3.getParentLayout() != null) {
                    ((ActionBarLayout) dVar3.getParentLayout()).p();
                    return;
                }
                return;
            default:
                ((c0a) obj).run();
                return;
        }
    }
}
