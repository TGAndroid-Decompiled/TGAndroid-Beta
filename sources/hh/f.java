package hh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.biometric.f0;
import androidx.recyclerview.widget.RecyclerView;
import dg.h0;
import eg.p1;
import eg.q1;
import f2.l;
import fg.e2;
import fg.s0;
import hg.z1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k7.c6;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import r0.b0;
public final class f extends sa implements xd.b {
    public static final int f7698o0 = 0;
    public final xd.c U;
    public final xd.a V;
    public final HashMap W;
    public final ArrayList X;
    public final ArrayList Y;
    public String Z;
    public x51 f7699a0;
    public final qh.d f7700b0;
    public final s0 f7701c0;
    public final q1 f7702d0;
    public final h20 f7703e0;
    public final u3 f7704f0;
    public final HashMap f7705g0;
    public f0 f7706h0;
    public int f7707i0;
    public final int f7708j0;
    public final FrameLayout f7709k0;
    public HashSet f7710l0;
    public final Rect m0;
    public p30 f7711n0;

    public f(Context context, g6 g6Var) {
        super(context, null, true, true, false, false, false, 2, g6Var);
        String country;
        pr prVar = pr.h;
        this.U = new xd.c(3, this, prVar, 350L);
        this.V = new xd.a(4, this, prVar, 320L, false);
        this.W = new HashMap();
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f7705g0 = new HashMap();
        this.m0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.I = false;
        this.f31020w = false;
        this.f7708j0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        tl0 tl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new e2(this, 2));
        this.d.setOnItemClickListener(new c(context, this, g6Var));
        qh.d dVar = new qh.d(context, g6Var, true);
        this.f7700b0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        s0 s0Var = new s0(this, context);
        this.f7701c0 = s0Var;
        s0Var.setTextColor(getThemedColor(k6.Sh));
        s0Var.setText(LocaleController.getString(R.string.Save));
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setTextSize(1, 14.0f);
        s0Var.setGravity(17);
        s0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s0Var.setVisibility(8);
        e6.a(s0Var);
        this.f31015e.n().addView(s0Var, c6.t(-2, 48, 16, 12, 0, 12, 0));
        s0Var.setOnClickListener(new a(this, 1));
        d20 d20Var = new d20(context, g6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        lg.f fVar = d20Var.f26172r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new eh.c(this, 1));
        h20 h20Var = new h20(context, this.currentAccount);
        this.f7703e0 = h20Var;
        h20Var.setDelegate(new b(this));
        q1 q1Var = new q1(context, this, g6Var);
        this.f7702d0 = q1Var;
        int i11 = this.backgroundPaddingLeft;
        q1Var.setPadding(i11, 0, i11, 0);
        q1Var.addView(d20Var, c6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        q1Var.addView(h20Var, c6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        u3 u3Var = new u3(context, 18, g6Var);
        this.f7704f0 = u3Var;
        u3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        u3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        q1Var.addView(u3Var, c6.e(-1, 32, 48));
        this.containerView.addView(q1Var, c6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, c6.c(48.0f, -1));
        this.containerView.addView(frameLayout, c6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f7709k0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, c6.e(-1, 150, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(prVar);
        lVar.C = false;
        lVar.f5910m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new d(this, g6Var));
        h0 h0Var = new h0(this, 9);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        if (LocaleController.getInstance().getCurrentLocaleInfo() != null) {
            country = LocaleController.getInstance().getCurrentLocaleInfo().getLangCode();
        } else {
            country = Locale.getDefault().getCountry();
        }
        tL_help_getCountriesList.lang_code = country;
        connectionsManager.sendRequest(tL_help_getCountriesList, new gf.a(h0Var, 3));
        b0.j(getContainer(), new b(this));
    }

    public static void P(f fVar, Pair pair) {
        HashMap hashMap = fVar.f7705g0;
        HashMap hashMap2 = fVar.W;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.X;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new z1(fVar, 1));
        HashSet hashSet = fVar.f7710l0;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        for (TLRPC.TL_help_country tL_help_country : (List) hashMap2.get((String) obj)) {
                            if (TextUtils.equals(str, tL_help_country.iso2)) {
                                break;
                            }
                        }
                    } else {
                        tL_help_country = null;
                        break;
                    }
                }
                if (tL_help_country != null) {
                    p30 p30Var = new p30(fVar.getContext(), tL_help_country);
                    p30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f7703e0.a(p30Var);
                    hashMap.put(tL_help_country.iso2, p30Var);
                }
            }
        }
        fVar.f7699a0.N(true);
        fVar.f7700b0.c(hashMap.size(), true);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 3) {
            Q();
            this.f7704f0.setTranslationY(AndroidUtilities.dp(48.0f) + f10);
            this.f7702d0.invalidate();
        } else if (i10 == 4) {
            a20.d(this.f7701c0, f10);
        }
    }

    public final void Q() {
        boolean z4;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.U.f50509e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.m0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z4 = false;
        } else {
            z4 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        tl0 tl0Var = this.d;
        tl0Var.setClipBounds(rect);
        if (z4) {
            tl0Var.invalidate();
        }
    }

    public final void R() {
        tl0 tl0Var;
        float f10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            tl0Var = this.d;
            if (i10 >= tl0Var.getChildCount()) {
                break;
            }
            View childAt = tl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10 + AndroidUtilities.dp(8.0f));
        q1 q1Var = this.f7702d0;
        if (q1Var.getTranslationY() != max) {
            q1Var.setTranslationY(max);
            tl0Var.invalidate();
        }
    }

    public final void S(View view) {
        p30 p30Var = (p30) view;
        if (p30Var.f29949y) {
            this.f7711n0 = null;
            this.f7703e0.c(p30Var);
            String countryIso2 = p30Var.getCountryIso2();
            HashMap hashMap = this.f7705g0;
            hashMap.remove(countryIso2);
            this.f7700b0.c(hashMap.size(), true);
            this.f7699a0.N(true);
            return;
        }
        p30 p30Var2 = this.f7711n0;
        if (p30Var2 != null) {
            p30Var2.a();
        }
        this.f7711n0 = p30Var;
        p30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(tl0Var, getContext(), this.currentAccount, 0, true, new p1(this, 1), this.resourcesProvider);
        this.f7699a0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
