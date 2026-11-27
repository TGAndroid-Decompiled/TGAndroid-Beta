package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.media.projection.MediaProjectionManager;
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.SessionsActivity;
public final class jn8 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public jn8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        mk0 mk0Var;
        ej9 ej9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                PrivacyControlActivity privacyControlActivity = ((mn8) obj).d;
                privacyControlActivity.showDialog(new xk8((e) privacyControlActivity, 27, false));
                return;
            case 1:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                privacySettingsActivity.getClass();
                sg2 sg2Var = (sg2) view;
                int intValue = ((Integer) sg2Var.getTag()).intValue();
                boolean[] zArr = privacySettingsActivity.a0;
                boolean z = !zArr[intValue];
                zArr[intValue] = z;
                sg2Var.c(z, true);
                return;
            case 2:
                zn8 zn8Var = (zn8) obj;
                if (!zn8Var.a) {
                    if (zn8Var.y == 0 && zn8Var.E) {
                        ((Activity) zn8Var.getContext()).startActivityForResult(((MediaProjectionManager) zn8Var.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        zn8Var.a(false, true);
                        return;
                    }
                }
                return;
            case 3:
                gkc gkcVar = (gkc) obj;
                if (!gkcVar.a) {
                    if (gkcVar.x == 0) {
                        ((Activity) gkcVar.getContext()).startActivityForResult(((MediaProjectionManager) gkcVar.getContext().getSystemService("media_projection")).createScreenCaptureIntent(), 520);
                        return;
                    } else {
                        gkcVar.a(false, true);
                        return;
                    }
                }
                return;
            case 4:
                ((sv8) obj).dismiss();
                return;
            case 5:
                hx8 hx8Var = (hx8) obj;
                ProxyListActivity proxyListActivity = hx8Var.s;
                wea weaVar = hx8Var.d;
                ?? eVar = new e(null);
                eVar.e = new rca[3];
                eVar.f = new ilb[2];
                eVar.s = new i29[3];
                eVar.E = 1.0f;
                eVar.F = new float[2];
                eVar.G = true;
                eVar.M = new kx8(eVar, (byte) 0);
                eVar.K = weaVar;
                proxyListActivity.presentFragment((e) eVar);
                return;
            case 6:
                ((zy8) obj).c.b.a.presentFragment(new PremiumPreviewFragment(0, "qr_emoji"));
                return;
            case 7:
                mb9 mb9Var = (mb9) obj;
                c51 c51Var = mb9Var.s;
                if (c51Var.e0 && !c51Var.R) {
                    c51Var.setLoading(true);
                    nb9 nb9Var = mb9Var.w;
                    CharSequence text = ((TextView) mb9Var.h.b).getText();
                    byte[] bArr = mb9Var.d.option;
                    String charSequence = mb9Var.n.getText().toString();
                    int i = nb9.v1;
                    nb9Var.L0(text, bArr, charSequence);
                    return;
                }
                return;
            case 8:
                kb9 kb9Var = (kb9) ((jo0) obj).e;
                if (kb9Var != null) {
                    kb9Var.run();
                    return;
                }
                return;
            case 9:
                ((wc9) obj).performClick();
                return;
            case 10:
                ((qe9) obj).dismiss();
                return;
            case 11:
                rf9 rf9Var = (rf9) obj;
                yh9 yh9Var = rf9Var.h;
                if (yh9Var != null && (mk0Var = rf9Var.f) != null) {
                    pi9 pi9Var = yh9Var.a;
                    if (pi9.u3(mk0Var)) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) mk0Var.b;
                        ch9 ch9Var = pi9Var.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                        }
                        pageblockdetails.open = !pageblockdetails.open;
                        pi9Var.g3.O(true);
                        ch9 ch9Var2 = pi9Var.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 12:
                gj9 gj9Var = (gj9) obj;
                mk0 mk0Var2 = gj9Var.a;
                if (mk0Var2 != null && (ej9Var = gj9Var.H) != null) {
                    ((li9) ej9Var).a.p3.y(mk0Var2);
                    return;
                }
                return;
            case 13:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray l = saveToGallerySettingsActivity.getUserConfig().l(saveToGallerySettingsActivity.a);
                    it9 it9Var = saveToGallerySettingsActivity.c;
                    l.put(it9Var.d, it9Var);
                    saveToGallerySettingsActivity.getUserConfig().z(saveToGallerySettingsActivity.a, l);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 14:
                ((mu9) obj).onBackPressed();
                return;
            case 15:
                ((w04) obj).f.a(((Integer) view.getTag(2131296463)).intValue());
                return;
            case 16:
                ((xd5) obj).dismiss();
                return;
            case 17:
                aw9 aw9Var = (aw9) ((ox0) obj).d;
                Activity activity = aw9Var.G;
                e eVar2 = aw9Var.H;
                int i2 = q61.m1;
                if (eVar2 != null && activity != null) {
                    final q61 q61Var = new q61((byte) 1, activity, false);
                    q61Var.w0 = false;
                    q61Var.v0 = false;
                    int i3 = aob.d6;
                    q61Var.L(i3);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    FrameLayout frameLayout = new FrameLayout(activity);
                    frameLayout.addView(linearLayout);
                    ImageView imageView = new ImageView(activity);
                    imageView.setBackground(aob.f0(aob.v0(aob.i6, q61Var.J0), 1, -1));
                    yob.s(imageView, aob.Aj, q61Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setImageResource(2131231312);
                    imageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r2;
                            q61 q61Var2 = q61Var;
                            switch (b2) {
                                case 0:
                                    q61Var2.dismiss();
                                    return;
                                default:
                                    q61Var2.dismiss();
                                    lq3 q = lq3.q(q61Var2.a);
                                    q.I.clear();
                                    q.getNotificationCenter().k(308, new Object[0]);
                                    q.getMessagesStorage().a.c(new hq3(q, (byte) 2));
                                    return;
                            }
                        }
                    });
                    int L = hl.L(8.0f);
                    imageView.setPadding(L, L, L, L);
                    frameLayout.addView(imageView, tre.d(36, 36.0f, 8388661, 6.0f, 8.0f, 8.0f, 0.0f));
                    a3b a3bVar = new a3b(activity, q61Var.a);
                    a3bVar.setStickerNum(9);
                    a3bVar.getImageReceiver().M(1);
                    linearLayout.addView(a3bVar, tre.t(110, 110, 1, 0, 26, 0, 0));
                    TextView textView = new TextView(activity);
                    textView.setGravity(1);
                    int i4 = aob.j5;
                    yob.X(textView, i4, null);
                    bs2.r(20.0f, 1, 2131751311, textView, null);
                    linearLayout.addView(textView, tre.d(-1, -2.0f, 0, 21.0f, 20.0f, 21.0f, 0.0f));
                    TextView textView2 = new TextView(activity);
                    textView2.setGravity(1);
                    textView2.setTextSize(1, 14.0f);
                    yob.X(textView2, i4, null);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    textView2.setText(ob6.a0("DownloadedFilesMessage", null, 2131751310, new Object[0]));
                    linearLayout.addView(textView2, tre.d(-1, -2.0f, 0, 28.0f, 7.0f, 28.0f, 0.0f));
                    TextView textView3 = new TextView(activity);
                    textView3.setGravity(17);
                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                    textView3.setEllipsize(truncateAt);
                    textView3.setSingleLine(true);
                    textView3.setTextSize(1, 14.0f);
                    textView3.setTypeface(hl.o());
                    textView3.setText(ob6.M0(2131748451, null));
                    yob.X(textView3, aob.Ji, null);
                    int L2 = hl.L(8.0f);
                    int i5 = aob.Fi;
                    int w0 = aob.w0(null, i5, false);
                    int o = vm2.o(aob.w0(null, i3, false), 120);
                    hf0 i0 = aob.i0(L2, L2, L2, L2, w0, o, o);
                    uob M = yob.M(i5);
                    uob g = yob.g(i3, 120);
                    textView3.setBackground(i0);
                    yob.j(textView3, i0, M, g, null);
                    linearLayout.addView(textView3, tre.d(-1, 48.0f, 0, 14.0f, 28.0f, 14.0f, 6.0f));
                    TextView textView4 = new TextView(activity);
                    textView4.setGravity(17);
                    textView4.setEllipsize(truncateAt);
                    textView4.setSingleLine(true);
                    textView4.setTextSize(1, 14.0f);
                    textView4.setTypeface(hl.o());
                    textView4.setText(ob6.M0(2131752058, null));
                    yob.X(textView4, i5, null);
                    int L3 = hl.L(8.0f);
                    int o2 = vm2.o(aob.w0(null, i5, false), 120);
                    hf0 i02 = aob.i0(L3, L3, L3, L3, 0, o2, o2);
                    uob g2 = yob.g(i5, 120);
                    textView4.setBackground(i02);
                    yob.j(textView4, i02, null, g2, null);
                    textView4.setLetterSpacing(0.025f);
                    linearLayout.addView(textView4, tre.d(-1, 48.0f, 0, 14.0f, 0.0f, 14.0f, 6.0f));
                    NestedScrollView nestedScrollView = new NestedScrollView(activity);
                    nestedScrollView.addView(frameLayout);
                    q61Var.O = nestedScrollView;
                    textView3.setOnClickListener(new je3(q61Var, eVar2, (byte) 8));
                    textView4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            byte b2 = r2;
                            q61 q61Var2 = q61Var;
                            switch (b2) {
                                case 0:
                                    q61Var2.dismiss();
                                    return;
                                default:
                                    q61Var2.dismiss();
                                    lq3 q = lq3.q(q61Var2.a);
                                    q.I.clear();
                                    q.getNotificationCenter().k(308, new Object[0]);
                                    q.getMessagesStorage().a.c(new hq3(q, (byte) 2));
                                    return;
                            }
                        }
                    });
                    q61Var.show();
                    return;
                }
                return;
            case 18:
                xs0 xs0Var = ((cw9) obj).d;
                xs0Var.setText("");
                hl.E3(xs0Var);
                return;
            case 19:
                new xk8(((ow9) obj).b, 24, true).show();
                return;
            case 20:
                ((nx9) obj).S(false);
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) obj;
                r47 r47Var = secretMediaViewer.g0;
                if (r47Var != null) {
                    TLRPC.Message message = r47Var.k;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        kg5 kg5Var = secretMediaViewer.r;
                        if (kg5Var.W) {
                            kg5Var.f(true);
                            return;
                        } else {
                            secretMediaViewer.m();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 22:
                b2a b2aVar = (b2a) obj;
                if (b2aVar.V1 instanceof TLRPC.User) {
                    c51 c51Var2 = b2aVar.c2;
                    if (!c51Var2.R) {
                        c51Var2.setLoading(true);
                        b2aVar.Z0((TLRPC.User) b2aVar.V1, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Runnable runnable = ((w2a) obj).e;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 24:
                h4a h4aVar = (h4a) obj;
                pj pjVar = h4aVar.y1.a;
                pj pjVar2 = pj.b;
                if (pjVar == pjVar2) {
                    pjVar2 = pj.a;
                }
                h4aVar.F0(oj.j(0L, pjVar2), true, false, true);
                h4aVar.m1.setText("");
                return;
            case 25:
                SessionsActivity sessionsActivity = ((yaa) obj).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    } else {
                        la1.i0(sessionsActivity.getParentActivity(), 2, new waa(sessionsActivity));
                        return;
                    }
                }
                return;
            case 26:
                sea seaVar = (sea) ((yv3) obj).w;
                ArrayList arrayList = seaVar.s;
                if (!arrayList.isEmpty()) {
                    seaVar.r = TextUtils.join(" ", arrayList).toString();
                    seaVar.n = false;
                    seaVar.d();
                    seaVar.x = null;
                    if (seaVar.b != 0) {
                        seaVar.b = (byte) 0;
                        rea reaVar = seaVar.I;
                        if (reaVar != null) {
                            ((xg3) reaVar).g(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 27:
                e eVar3 = ((qha) obj).f.y1;
                if (eVar3 != null && eVar3.getParentLayout() != null) {
                    ((ActionBarLayout) eVar3.getParentLayout()).p();
                    return;
                }
                return;
            case 28:
                ((ux9) obj).run();
                return;
            default:
                kja kjaVar = (kja) obj;
                if (kjaVar.d != null) {
                    int intValue2 = ((Integer) view.getTag()).intValue();
                    gja gjaVar = kjaVar.d;
                    int i6 = kjaVar.c[intValue2];
                    r47 r47Var2 = kjaVar.b[intValue2];
                    yg4 yg4Var = ((wg4) ((wz4) gjaVar).a).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = yg4.t0;
                    yg4Var.e(i6, kjaVar, r47Var2, intValue2);
                    return;
                }
                return;
        }
    }
}
