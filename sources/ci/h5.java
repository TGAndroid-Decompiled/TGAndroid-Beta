package ci;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hs;
public final class h5 extends hs {
    public final i5 f5394c;

    public h5(i5 i5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f5394c = i5Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        i5 i5Var = this.f5394c;
        t5 t5Var = i5Var.f5444x;
        s5 s5Var = t5Var.E;
        if (s5Var != null && s5Var.f5913f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (t5Var.O.f5286a) {
            i10 = R.drawable.menu_views_reactions2;
        } else {
            i10 = R.drawable.menu_views_reactions;
        }
        int i14 = i10;
        if (z10) {
            i11 = R.string.SortByReposts;
        } else {
            i11 = R.string.SortByReactions;
        }
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, t5Var.f5953s);
        if (!t5Var.O.f5286a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final h5 f5359b;

            {
                this.f5359b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5359b.f5394c.f5444x;
                        e5 e5Var = t5Var2.O;
                        if (!e5Var.f5286a) {
                            e5 e5Var2 = t5Var2.M;
                            if (e5Var2 != null) {
                                e5Var.f5286a = true;
                                e5Var2.f5286a = true;
                            } else {
                                e5Var.f5286a = true;
                            }
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            t5Var2.N.run(t5Var2);
                        }
                        h5 h5Var = t5Var2.f5950f;
                        if (h5Var != null) {
                            h5Var.a();
                            return;
                        }
                        return;
                    default:
                        t5 t5Var3 = this.f5359b.f5394c.f5444x;
                        e5 e5Var3 = t5Var3.O;
                        if (e5Var3.f5286a) {
                            e5 e5Var4 = t5Var3.M;
                            if (e5Var4 != null) {
                                e5Var3.f5286a = false;
                                e5Var4.f5286a = false;
                            } else {
                                e5Var3.f5286a = false;
                            }
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            t5Var3.N.run(t5Var3);
                        }
                        h5 h5Var2 = t5Var3.f5950f;
                        if (h5Var2 != null) {
                            h5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!t5Var.O.f5286a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, t5Var.f5953s);
        if (t5Var.O.f5286a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final h5 f5359b;

            {
                this.f5359b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        t5 t5Var2 = this.f5359b.f5394c.f5444x;
                        e5 e5Var = t5Var2.O;
                        if (!e5Var.f5286a) {
                            e5 e5Var2 = t5Var2.M;
                            if (e5Var2 != null) {
                                e5Var.f5286a = true;
                                e5Var2.f5286a = true;
                            } else {
                                e5Var.f5286a = true;
                            }
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            t5Var2.N.run(t5Var2);
                        }
                        h5 h5Var = t5Var2.f5950f;
                        if (h5Var != null) {
                            h5Var.a();
                            return;
                        }
                        return;
                    default:
                        t5 t5Var3 = this.f5359b.f5394c.f5444x;
                        e5 e5Var3 = t5Var3.O;
                        if (e5Var3.f5286a) {
                            e5 e5Var4 = t5Var3.M;
                            if (e5Var4 != null) {
                                e5Var3.f5286a = false;
                                e5Var4.f5286a = false;
                            } else {
                                e5Var3.f5286a = false;
                            }
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            t5Var3.N.run(t5Var3);
                        }
                        h5 h5Var2 = t5Var3.f5950f;
                        if (h5Var2 != null) {
                            h5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(i5Var.getContext(), org.telegram.ui.ActionBar.h6.H8, t5Var.f5953s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = t5Var.f5953s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.z5.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
