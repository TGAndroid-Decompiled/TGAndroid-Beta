package ih;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.nr;
public final class v4 extends nr {
    public final w4 f12232c;

    public v4(w4 w4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f12232c = w4Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        w4 w4Var = this.f12232c;
        g5 g5Var = w4Var.f12301x;
        f5 f5Var = g5Var.A;
        if (f5Var != null && f5Var.f11436f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i9 = R.drawable.menu_views_reposts;
        } else if (g5Var.K.f12115a) {
            i9 = R.drawable.menu_views_reactions2;
        } else {
            i9 = R.drawable.menu_views_reactions;
        }
        int i13 = i9;
        if (z10) {
            i10 = R.string.SortByReposts;
        } else {
            i10 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i13, LocaleController.getString(i10), false, g5Var.f11482s);
        if (!g5Var.K.f12115a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final v4 f12185b;

            {
                this.f12185b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g5 g5Var2 = this.f12185b.f12232c.f12301x;
                        s4 s4Var = g5Var2.K;
                        if (!s4Var.f12115a) {
                            s4 s4Var2 = g5Var2.I;
                            if (s4Var2 != null) {
                                s4Var.f12115a = true;
                                s4Var2.f12115a = true;
                            } else {
                                s4Var.f12115a = true;
                            }
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            g5Var2.J.accept(g5Var2);
                        }
                        v4 v4Var = g5Var2.f11479f;
                        if (v4Var != null) {
                            v4Var.a();
                            return;
                        }
                        return;
                    default:
                        g5 g5Var3 = this.f12185b.f12232c.f12301x;
                        s4 s4Var3 = g5Var3.K;
                        if (s4Var3.f12115a) {
                            s4 s4Var4 = g5Var3.I;
                            if (s4Var4 != null) {
                                s4Var3.f12115a = false;
                                s4Var4.f12115a = false;
                            } else {
                                s4Var3.f12115a = false;
                            }
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            g5Var3.J.accept(g5Var3);
                        }
                        v4 v4Var2 = g5Var3.f11479f;
                        if (v4Var2 != null) {
                            v4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!g5Var.K.f12115a) {
            i11 = R.drawable.menu_views_recent2;
        } else {
            i11 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i11, LocaleController.getString(R.string.SortByTime), false, g5Var.f11482s);
        if (g5Var.K.f12115a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final v4 f12185b;

            {
                this.f12185b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        g5 g5Var2 = this.f12185b.f12232c.f12301x;
                        s4 s4Var = g5Var2.K;
                        if (!s4Var.f12115a) {
                            s4 s4Var2 = g5Var2.I;
                            if (s4Var2 != null) {
                                s4Var.f12115a = true;
                                s4Var2.f12115a = true;
                            } else {
                                s4Var.f12115a = true;
                            }
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            g5Var2.J.accept(g5Var2);
                        }
                        v4 v4Var = g5Var2.f11479f;
                        if (v4Var != null) {
                            v4Var.a();
                            return;
                        }
                        return;
                    default:
                        g5 g5Var3 = this.f12185b.f12232c.f12301x;
                        s4 s4Var3 = g5Var3.K;
                        if (s4Var3.f12115a) {
                            s4 s4Var4 = g5Var3.I;
                            if (s4Var4 != null) {
                                s4Var3.f12115a = false;
                                s4Var4.f12115a = false;
                            } else {
                                s4Var3.f12115a = false;
                            }
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            g5Var3.J.accept(g5Var3);
                        }
                        v4 v4Var2 = g5Var3.f11479f;
                        if (v4Var2 != null) {
                            v4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View l1Var = new org.telegram.ui.ActionBar.l1(w4Var.getContext(), org.telegram.ui.ActionBar.f6.H8, g5Var.f11482s);
        l1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, g7.e6.n(-1, 8));
        if (z10) {
            i12 = R.string.StoryReactionsSortDescription;
        } else {
            i12 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i12);
        b bVar = g5Var.f11482s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, g7.e6.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
