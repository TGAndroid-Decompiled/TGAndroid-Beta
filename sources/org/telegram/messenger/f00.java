package org.telegram.messenger;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
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
import org.telegram.ui.dx0;
import org.telegram.ui.qe1;
import org.telegram.ui.qv0;
public final class f00 implements Runnable {
    public final int f15673a;
    public final Object f15674b;
    public final Object f15675c;
    public final Object d;

    public f00(Object obj, Object obj2, Object obj3, int i10) {
        this.f15673a = i10;
        this.f15675c = obj;
        this.d = obj2;
        this.f15674b = obj3;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.p6 p6Var;
        switch (this.f15673a) {
            case 0:
                ((MediaBrowserService.Result) ((s1) this.d).f18056b).sendResult(((i00) this.f15675c).d((String) this.f15674b));
                return;
            case 1:
                ((h00) this.f15675c).q((String) this.f15674b, (Bundle) this.d);
                return;
            case 2:
                u10 u10Var = (u10) this.f15675c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                storyItem.detectedLng = "und";
                u10Var.getMessagesController().O1().f48925k.h(storyItem.dialogId, storyItem);
                u10Var.I.remove((s10) this.f15674b);
                return;
            case 3:
                int[] iArr = (int[]) this.f15675c;
                Runnable runnable = (Runnable) this.f15674b;
                Pattern pattern = Utilities.f14519a;
                int i10 = iArr[0] + 1;
                iArr[0] = i10;
                if (i10 == ((r20[]) this.d).length && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                String str = (String) this.f15674b;
                String str2 = (String) this.f15675c;
                byte[] bArr = (byte[]) this.d;
                int i11 = WearAuthListenerService.f14531r;
                str.getClass();
                if (!str.equals("/tg-wear-auth/offer")) {
                    if (!str.equals("/tg-wear-auth/cancel")) {
                        f8.b("wear-auth: unexpected path ".concat(str));
                        return;
                    }
                    f8.b("wear-auth: cancel from " + str2);
                    BigInteger bigInteger = qe1.f40762a;
                    f8.b("wear-auth: cancel received; dropping session and dismissing sheet");
                    qe1.d = null;
                    org.telegram.ui.ActionBar.z2 z2Var = qe1.f40764c;
                    if (z2Var != null) {
                        z2Var.dismiss();
                        qe1.f40764c = null;
                        return;
                    }
                    return;
                }
                StringBuilder u10 = a1.g.u("wear-auth: offer from ", str2, " (");
                u10.append(bArr.length);
                u10.append(" bytes)");
                f8.b(u10.toString());
                BigInteger bigInteger2 = qe1.f40762a;
                if (bArr.length != 272) {
                    f8.b("wear-auth: malformed offer (" + bArr.length + ")");
                    return;
                }
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
                bh.d dVar = qe1.d;
                if (dVar != null && Arrays.equals((byte[]) dVar.f2777a, copyOfRange)) {
                    f8.b("wear-auth: duplicate offer (same sessionId) — ignoring");
                    return;
                }
                f8.b("wear-auth: new session " + qe1.d(copyOfRange) + " from " + str2);
                ?? obj = new Object();
                obj.f2777a = copyOfRange;
                obj.f2778b = copyOfRange2;
                obj.f2779c = str2;
                qe1.d = obj;
                Context context = LaunchActivity.I1;
                if (context == null) {
                    context = w0.f18945b;
                }
                if (context != null) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        p6Var = T.getResourceProvider();
                    } else {
                        p6Var = null;
                    }
                    org.telegram.ui.ActionBar.z2 z2Var2 = qe1.f40764c;
                    if (z2Var2 != null) {
                        z2Var2.dismiss();
                        qe1.f40764c = null;
                    }
                    org.telegram.ui.ActionBar.z2 k10 = m5.k(1, context, p6Var, false);
                    FrameLayout frameLayout = new FrameLayout(context);
                    k10.N = frameLayout;
                    int i12 = e20.f15506s0;
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    for (int i13 = 0; i13 < 4; i13++) {
                        if (e20.i(i13).p()) {
                            if (!ConnectionsManager.getInstance(i13).isTestBackend()) {
                                i12 = i13;
                            }
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    Collections.sort(arrayList, new dx0(7));
                    if (!arrayList.isEmpty()) {
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        FrameLayout frameLayout3 = new FrameLayout(context);
                        int L = i0.L(14.0f);
                        int i14 = org.telegram.ui.ActionBar.t6.f21020i5;
                        Drawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i14, p6Var));
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
                        frameLayout3.setBackground(d02);
                        org.telegram.ui.ActionBar.a7.k(frameLayout3, d02, N, null, p6Var);
                        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
                        g9Var.setRoundRadius(i0.L(14.0f));
                        g9Var.getImageReceiver().A0 = true;
                        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                        int[] iArr2 = {e20.f15506s0};
                        TLRPC.User f7 = e20.i(iArr2[0]).f();
                        r8Var.r(f7);
                        g9Var.e(f7, r8Var);
                        frameLayout3.addView(g9Var, w7.b6.e(28, 28, 115));
                        ImageView imageView = new ImageView(context);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21186r5, p6Var, PorterDuff.Mode.SRC_IN);
                        imageView.setImageResource(2131230873);
                        frameLayout3.addView(imageView, w7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
                        frameLayout2.addView(frameLayout3, w7.b6.e(52, 28, 17));
                        frameLayout2.setPadding(i0.L(8.0f), i0.L(4.0f), i0.L(8.0f), 0);
                        frameLayout.addView(frameLayout2, w7.b6.q(-2, -2, 0.0f, 51, 6, 4, 6, 0));
                        w7.e6.a(frameLayout2);
                        if (arrayList.size() <= 1) {
                            frameLayout2.setVisibility(8);
                        }
                        LinearLayout f10 = m5.f(context, 1);
                        frameLayout.addView(f10, w7.b6.e(-1, -1, 119));
                        org.telegram.ui.Components.g9 g9Var2 = new org.telegram.ui.Components.g9(context);
                        f10.addView(g9Var2, w7.b6.s(130, 130, 49, 32.0f, 32.0f, 32.0f, 9.66f));
                        vi.b0(i12).c2(g9Var2, "Utya3D", "😎", "130_130");
                        int i15 = org.telegram.ui.ActionBar.t6.f21038j5;
                        TextView b10 = w7.g6.b(context, 20.0f, i15, true, p6Var);
                        m5.l(b10, 17, null, 2131742970);
                        f10.addView(b10, w7.b6.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                        TextView b11 = w7.g6.b(context, 14.0f, i15, false, null);
                        m5.l(b11, 17, null, 2131742971);
                        f10.addView(b11, w7.b6.t(-1, -2, 49, 32, 0, 32, 24));
                        vh.d i16 = a30.i(24, context, p6Var, true);
                        i16.setText(dd.L0(2131748267, null));
                        f10.addView(i16, w7.b6.t(-1, 48, 7, 12, 12, 12, 8));
                        int i17 = org.telegram.ui.ActionBar.t6.f20873a7;
                        k10.w0(i17);
                        k10.Q(i17);
                        frameLayout2.setOnClickListener(new mg.f(k10, frameLayout3, arrayList, iArr2, r8Var, g9Var, 5));
                        i16.setOnClickListener(new qv0(17, i16, iArr2));
                        qe1.f40764c = k10;
                        k10.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public f00(h00 h00Var, String str, Bundle bundle) {
        this.f15673a = 1;
        this.f15675c = h00Var;
        this.f15674b = str;
        this.d = bundle;
    }

    public f00(byte[] bArr, String str, String str2) {
        this.f15673a = 4;
        this.f15674b = str;
        this.f15675c = str2;
        this.d = bArr;
    }
}
