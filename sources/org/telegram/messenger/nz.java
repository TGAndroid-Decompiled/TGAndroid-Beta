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
import org.telegram.ui.ig0;
import org.telegram.ui.ow0;
import org.telegram.ui.wc1;
public final class nz implements Runnable {
    public final int f26104a;
    public final Object f26105b;
    public final Object f26106c;
    public final Object d;

    public nz(Object obj, Object obj2, Object obj3, int i7) {
        this.f26104a = i7;
        this.f26105b = obj;
        this.f26106c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.i6 i6Var;
        switch (this.f26104a) {
            case 0:
                ((oz) this.f26105b).q((String) this.f26106c, (Bundle) this.d);
                return;
            case 1:
                y00 y00Var = (y00) this.f26105b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f26106c;
                storyItem.detectedLng = "und";
                y00Var.getMessagesController().R1().f12395k.h(storyItem.dialogId, storyItem);
                y00Var.J.remove((w00) this.d);
                return;
            case 2:
                int[] iArr = (int[]) this.f26105b;
                Runnable runnable = (Runnable) this.d;
                Pattern pattern = Utilities.f22874a;
                int i7 = iArr[0] + 1;
                iArr[0] = i7;
                if (i7 == ((w10[]) this.f26106c).length && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = (String) this.f26106c;
                String str2 = (String) this.f26105b;
                byte[] bArr = (byte[]) this.d;
                int i10 = WearAuthListenerService.f22888r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        a8.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    a8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = wc1.f53296a;
                    a8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    wc1.d = null;
                    org.telegram.ui.ActionBar.w2 w2Var = wc1.f53298c;
                    if (w2Var != null) {
                        w2Var.dismiss();
                        wc1.f53298c = null;
                        return;
                    }
                    return;
                }
                StringBuilder u10 = a8.p0.u("wear-auth: offer from ", str2, " (");
                u10.append(bArr.length);
                u10.append(" bytes)");
                a8.b(u10.toString());
                BigInteger bigInteger2 = wc1.f53296a;
                if (bArr.length != 272) {
                    a8.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                a8.r7 r7Var = wc1.d;
                if (r7Var != null && Arrays.equals((byte[]) r7Var.f616b, copyOfRange)) {
                    a8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                a8.b("wear-auth: new session " + wc1.d(copyOfRange) + " from " + str2);
                wc1.d = new a8.r7(copyOfRange, copyOfRange2, str2);
                Context context = LaunchActivity.H1;
                if (context == null) {
                    context = t0.f27013b;
                }
                if (context != null) {
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (T != null) {
                        i6Var = T.getResourceProvider();
                    } else {
                        i6Var = null;
                    }
                    org.telegram.ui.ActionBar.w2 w2Var2 = wc1.f53298c;
                    if (w2Var2 != null) {
                        w2Var2.dismiss();
                        wc1.f53298c = null;
                    }
                    org.telegram.ui.ActionBar.w2 j3 = f3.j(1, context, i6Var, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    j3.O = frameLayout;
                    int i11 = i10.f24637t0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i12 = 0; i12 < 4; i12++) {
                        if (i10.i(i12).p()) {
                            if (!ConnectionsManager.getInstance(i12).isTestBackend()) {
                                i11 = i12;
                            }
                            arrayList.add(Integer.valueOf(i12));
                        }
                    }
                    Collections.sort(arrayList, new ow0(6));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = g0.L(14.0f);
                        int i13 = org.telegram.ui.ActionBar.n6.f29542i5;
                        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i13, i6Var));
                        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i13);
                        frameLayout3.setBackground(d02);
                        org.telegram.ui.ActionBar.u6.j(frameLayout3, d02, M, null, i6Var);
                        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                        p9Var.setRoundRadius(g0.L(14.0f));
                        p9Var.getImageReceiver().B0 = true;
                        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
                        int[] iArr2 = {i10.f24637t0};
                        TLRPC.User f10 = i10.i(iArr2[0]).f();
                        a9Var.r(f10);
                        p9Var.f(f10, a9Var);
                        frameLayout3.addView(p9Var, c8.na.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29709r5, i6Var, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, c8.na.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, c8.na.e(52, 28, 17));
                        frameLayout2.setPadding(g0.L(8.0f), g0.L(4.0f), g0.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, c8.na.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        c8.sa.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout g10 = f3.g(context, 1);
                        frameLayout.addView(g10, c8.na.e(-1, -1, 119));
                        org.telegram.ui.Components.p9 p9Var2 = new org.telegram.ui.Components.p9(context);
                        g10.addView(p9Var2, c8.na.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        ri.d0(i11).h2(p9Var2, "Utya3D", "😎", "130_130");
                        int i14 = org.telegram.ui.ActionBar.n6.f29559j5;
                        TextView b10 = c8.wa.b(context, 20.0f, i14, true, i6Var);
                        f3.k(b10, 17, null, 2131742673);
                        g10.addView(b10, c8.na.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b11 = c8.wa.b(context, 14.0f, i14, false, null);
                        f3.k(b11, 17, null, 2131742674);
                        g10.addView(b11, c8.na.t(-1, -2, 49, 32, 0, 32, 24));
                        hi.e g11 = m10.g(24, context, i6Var, true);
                        g11.setText(gd.N0(2131748057, null));
                        g10.addView(g11, c8.na.t(-1, 48, 7, 12, 12, 12, 8));
                        int i15 = org.telegram.ui.ActionBar.n6.f29394a7;
                        j3.w0(i15);
                        j3.Q(i15);
                        frameLayout2.setOnClickListener(new org.telegram.ui.Components.v1(j3, frameLayout3, arrayList, iArr2, a9Var, p9Var, 4));
                        g11.setOnClickListener(new ig0(23, g11, iArr2));
                        wc1.f53298c = j3;
                        j3.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public nz(byte[] bArr, String str, String str2) {
        this.f26104a = 3;
        this.f26106c = str;
        this.f26105b = str2;
        this.d = bArr;
    }
}
