package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jg0;
import org.telegram.ui.qw0;
import org.telegram.ui.yc1;
public final class oz implements Runnable {
    public final int f26154a;
    public final Object f26155b;
    public final Object f26156c;
    public final Object d;

    public oz(Object obj, Object obj2, Object obj3, int i7) {
        this.f26154a = i7;
        this.f26155b = obj;
        this.f26156c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h6 h6Var;
        switch (this.f26154a) {
            case 0:
                ((pz) this.f26155b).q((String) this.f26156c, (Bundle) this.d);
                return;
            case 1:
                z00 z00Var = (z00) this.f26155b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f26156c;
                storyItem.detectedLng = "und";
                z00Var.getMessagesController().R1().f12430k.h(storyItem.dialogId, storyItem);
                z00Var.J.remove((x00) this.d);
                return;
            case 2:
                int[] iArr = (int[]) this.f26155b;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.f22804a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == ((x10[]) this.f26156c).length && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = (String) this.f26156c;
                String str2 = (String) this.f26155b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.f22818r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        a8.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = yc1.f54160a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    yc1.d = null;
                    org.telegram.ui.ActionBar.w2 w2Var = yc1.f54162c;
                    if (w2Var != null) {
                        w2Var.dismiss();
                        yc1.f54162c = null;
                        return;
                    }
                    return;
                }
                StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                u10.append(bArr.length);
                u10.append(" bytes)");
                a8.b(u10.toString());
                BigInteger bigInteger2 = yc1.f54160a;
                if (bArr.length != 272) {
                    a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                a8.r7 r7Var = yc1.d;
                if (r7Var != null && Arrays.equals((byte[]) r7Var.f617b, copyOfRange)) {
                    a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                a8.b("wear-auth: new session " + yc1.d(copyOfRange) + " from " + str2);
                yc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = t0.f26941b;
                }
                if (context != null) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        h6Var = T.getResourceProvider();
                    } else {
                        h6Var = null;
                    }
                    org.telegram.ui.ActionBar.w2 w2Var2 = yc1.f54162c;
                    if (w2Var2 != null) {
                        w2Var2.dismiss();
                        yc1.f54162c = null;
                    }
                    org.telegram.ui.ActionBar.w2 j3 = f3.j(1, context, h6Var, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    j3.O = frameLayout;
                    int i11 = j10.f24798t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i12 = 0; i12 < 4; i12++) {
                        if (j10.i(i12).p()) {
                            if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                i11 = i12;
                            }
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    Collections.sort(arrayList, new qw0(6));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = g0.L(14.0f);
                        int i13 = org.telegram.ui.ActionBar.m6.f29469i5;
                        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i13, h6Var));
                        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
                        frameLayout3.setBackground(d02);
                        org.telegram.ui.ActionBar.t6.j(frameLayout3, d02, M, null, h6Var);
                        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                        q9Var.setRoundRadius(g0.L(14.0f));
                        q9Var.getImageReceiver().B0 = true;
                        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
                        int[] iArr2 = {j10.f24798t0};
                        TLRPC.User f10 = j10.i(iArr2[0]).f();
                        b9Var.r(f10);
                        q9Var.f(f10, b9Var);
                        frameLayout3.addView(q9Var, c8.ma.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29636r5, h6Var, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, c8.ma.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, c8.ma.e(52, 28, 17));
                        frameLayout2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, c8.ma.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        c8.ra.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout g10 = f3.g(context, 1);
                        frameLayout.addView(g10, c8.ma.e(-1, -1, 119));
                        org.telegram.ui.Components.q9 q9Var2 = new org.telegram.ui.Components.q9(context);
                        g10.addView(q9Var2, c8.ma.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        ri.d0(i11).h2(q9Var2, "Utya3D", "😎", "130_130");
                        int i14 = org.telegram.ui.ActionBar.m6.f29486j5;
                        TextView b10 = c8.va.b(context, 20.0f, i14, true, h6Var);
                        f3.k(b10, 17, null, 2131742680);
                        g10.addView(b10, c8.ma.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b11 = c8.va.b(context, 14.0f, i14, false, null);
                        f3.k(b11, 17, null, 2131742681);
                        g10.addView(b11, c8.ma.t(-1, -2, 49, 32, 0, 32, 24));
                        hi.e g11 = n10.g(24, context, h6Var, true);
                        g11.setText(gd.N0(2131748057, null));
                        g10.addView(g11, c8.ma.t(-1, 48, 7, 12, 12, 12, 8));
                        int i15 = org.telegram.ui.ActionBar.m6.f29321a7;
                        j3.w0(i15);
                        j3.Q(i15);
                        frameLayout2.setOnClickListener(new org.telegram.ui.Components.w1(j3, frameLayout3, arrayList, iArr2, b9Var, q9Var, 4));
                        g11.setOnClickListener(new jg0(23, g11, iArr2));
                        yc1.f54162c = j3;
                        j3.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public oz(byte[] bArr, String str, String str2) {
        this.f26154a = 3;
        this.f26156c = str;
        this.f26155b = str2;
        this.d = bArr;
    }
}
