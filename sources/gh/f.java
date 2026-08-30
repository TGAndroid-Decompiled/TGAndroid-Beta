package gh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import androidx.biometric.f0;
import androidx.recyclerview.widget.RecyclerView;
import cg.h0;
import dg.r1;
import dg.s1;
import eg.f2;
import eg.s0;
import f2.l;
import gg.z1;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z10;
import r0.b0;
public final class f extends sa implements xd.b {
    public static final int f6838o0 = 0;
    public final xd.c U;
    public final xd.a V;
    public final HashMap W;
    public final ArrayList X;
    public final ArrayList Y;
    public String Z;
    public w51 f6839a0;
    public final ph.d f6840b0;
    public final s0 f6841c0;
    public final s1 f6842d0;
    public final g20 f6843e0;
    public final u3 f6844f0;
    public final HashMap f6845g0;
    public f0 f6846h0;
    public int f6847i0;
    public final int f6848j0;
    public final FrameLayout f6849k0;
    public HashSet f6850l0;
    public final Rect m0;
    public n30 f6851n0;

    public f(Context context, f6 f6Var) {
        super(context, null, true, true, false, false, false, 2, f6Var);
        String country;
        nr nrVar = nr.h;
        this.U = new xd.c(3, this, nrVar, 350L);
        this.V = new xd.a(4, this, nrVar, 320L, false);
        this.W = new HashMap();
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.f6845g0 = new HashMap();
        this.m0 = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.I = false;
        this.f28681w = false;
        this.f6848j0 = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        sl0 sl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.d.setClipToPadding(false);
        this.d.j(new f2(this, 2));
        this.d.setOnItemClickListener(new c(context, this, f6Var));
        ph.d dVar = new ph.d(context, f6Var, true);
        this.f6840b0 = dVar;
        dVar.e();
        dVar.setCountFilled(true);
        dVar.setText(LocaleController.getString(R.string.Save));
        dVar.setOnClickListener(new a(this, 0));
        s0 s0Var = new s0(this, context);
        this.f6841c0 = s0Var;
        s0Var.setTextColor(getThemedColor(j6.Sh));
        s0Var.setText(LocaleController.getString(R.string.Save));
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setTextSize(1, 14.0f);
        s0Var.setGravity(17);
        s0Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        s0Var.setVisibility(8);
        d6.a(s0Var);
        this.e.n().addView(s0Var, b6.t(-2, 48, 16, 12, 0, 12, 0));
        s0Var.setOnClickListener(new a(this, 1));
        c20 c20Var = new c20(context, f6Var);
        String string = LocaleController.getString(R.string.PollV2SearchHint);
        kg.f fVar = c20Var.f23815r;
        fVar.setHint(string);
        fVar.addTextChangedListener(new dh.c(this, 1));
        g20 g20Var = new g20(context, this.currentAccount);
        this.f6843e0 = g20Var;
        g20Var.setDelegate(new b(this));
        s1 s1Var = new s1(context, this, f6Var);
        this.f6842d0 = s1Var;
        int i11 = this.backgroundPaddingLeft;
        s1Var.setPadding(i11, 0, i11, 0);
        s1Var.addView(c20Var, b6.d(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        s1Var.addView(g20Var, b6.d(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        u3 u3Var = new u3(context, 18, f6Var);
        this.f6844f0 = u3Var;
        u3Var.setTranslationY(AndroidUtilities.dp(48.0f));
        u3Var.c(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new a(this, 2));
        s1Var.addView(u3Var, b6.e(-1, 32, 48));
        this.containerView.addView(s1Var, b6.e(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(dVar, b6.c(48.0f, -1));
        this.containerView.addView(frameLayout, b6.e(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f6849k0 = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, b6.e(-1, 150, 80));
        l lVar = new l();
        lVar.n(350L);
        lVar.o(nrVar);
        lVar.C = false;
        lVar.f5818m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new d(this, f6Var));
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
        HashMap hashMap = fVar.f6845g0;
        HashMap hashMap2 = fVar.W;
        hashMap2.putAll((Map) pair.first);
        ArrayList arrayList = fVar.X;
        arrayList.addAll((Collection) pair.second);
        Map.EL.forEach(hashMap2, new z1(fVar, 1));
        HashSet hashSet = fVar.f6850l0;
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
                    n30 n30Var = new n30(fVar.getContext(), tL_help_country);
                    n30Var.setOnClickListener(new a(fVar, 3));
                    fVar.f6843e0.a(n30Var);
                    hashMap.put(tL_help_country.iso2, n30Var);
                }
            }
        }
        fVar.f6839a0.N(true);
        fVar.f6840b0.c(hashMap.size(), true);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 3) {
            Q();
            this.f6844f0.setTranslationY(AndroidUtilities.dp(48.0f) + f10);
            this.f6842d0.invalidate();
        } else if (i10 == 4) {
            z10.d(this.f6841c0, f10);
        }
    }

    public final void Q() {
        boolean z4;
        int dp = AndroidUtilities.dp(56.0f) + k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.U.e);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.m0;
        if (rect.top == dp && rect.bottom == measuredHeight) {
            z4 = false;
        } else {
            z4 = true;
        }
        rect.set(0, dp, this.containerView.getMeasuredWidth(), measuredHeight);
        sl0 sl0Var = this.d;
        sl0Var.setClipBounds(rect);
        if (z4) {
            sl0Var.invalidate();
        }
    }

    public final void R() {
        sl0 sl0Var;
        float f10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            sl0Var = this.d;
            if (i10 >= sl0Var.getChildCount()) {
                break;
            }
            View childAt = sl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i10++;
        }
        float max = Math.max(k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10 + AndroidUtilities.dp(8.0f));
        s1 s1Var = this.f6842d0;
        if (s1Var.getTranslationY() != max) {
            s1Var.setTranslationY(max);
            sl0Var.invalidate();
        }
    }

    public final void S(View view) {
        n30 n30Var = (n30) view;
        if (n30Var.f27182y) {
            this.f6851n0 = null;
            this.f6843e0.c(n30Var);
            String countryIso2 = n30Var.getCountryIso2();
            HashMap hashMap = this.f6845g0;
            hashMap.remove(countryIso2);
            this.f6840b0.c(hashMap.size(), true);
            this.f6839a0.N(true);
            return;
        }
        n30 n30Var2 = this.f6851n0;
        if (n30Var2 != null) {
            n30Var2.a();
        }
        this.f6851n0 = n30Var;
        n30Var.b();
    }

    @Override
    public final void onContainerLayout(int i10, int i11, int i12, int i13) {
        super.onContainerLayout(i10, i11, i12, i13);
        Q();
        R();
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, true, new r1(this, 1), this.resourcesProvider);
        this.f6839a0 = w51Var;
        w51Var.f30240r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
