package ci;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hs;
public final class i5 extends hs {
    public final j5 f5490c;

    public i5(j5 j5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f5490c = j5Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        j5 j5Var = this.f5490c;
        u5 u5Var = j5Var.f5542x;
        t5 t5Var = u5Var.E;
        if (t5Var != null && t5Var.f6011f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (u5Var.O.f5387a) {
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
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, u5Var.f6054s);
        if (!u5Var.O.f5387a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5465b;

            {
                this.f5465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5465b.f5490c.f5542x;
                        f5 f5Var = u5Var2.O;
                        if (!f5Var.f5387a) {
                            f5 f5Var2 = u5Var2.M;
                            if (f5Var2 != null) {
                                f5Var.f5387a = true;
                                f5Var2.f5387a = true;
                            } else {
                                f5Var.f5387a = true;
                            }
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            u5Var2.N.run(u5Var2);
                        }
                        i5 i5Var = u5Var2.f6051f;
                        if (i5Var != null) {
                            i5Var.a();
                            return;
                        }
                        return;
                    default:
                        u5 u5Var3 = this.f5465b.f5490c.f5542x;
                        f5 f5Var3 = u5Var3.O;
                        if (f5Var3.f5387a) {
                            f5 f5Var4 = u5Var3.M;
                            if (f5Var4 != null) {
                                f5Var3.f5387a = false;
                                f5Var4.f5387a = false;
                            } else {
                                f5Var3.f5387a = false;
                            }
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            u5Var3.N.run(u5Var3);
                        }
                        i5 i5Var2 = u5Var3.f6051f;
                        if (i5Var2 != null) {
                            i5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!u5Var.O.f5387a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, u5Var.f6054s);
        if (u5Var.O.f5387a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) {
            public final i5 f5465b;

            {
                this.f5465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        u5 u5Var2 = this.f5465b.f5490c.f5542x;
                        f5 f5Var = u5Var2.O;
                        if (!f5Var.f5387a) {
                            f5 f5Var2 = u5Var2.M;
                            if (f5Var2 != null) {
                                f5Var.f5387a = true;
                                f5Var2.f5387a = true;
                            } else {
                                f5Var.f5387a = true;
                            }
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            u5Var2.N.run(u5Var2);
                        }
                        i5 i5Var = u5Var2.f6051f;
                        if (i5Var != null) {
                            i5Var.a();
                            return;
                        }
                        return;
                    default:
                        u5 u5Var3 = this.f5465b.f5490c.f5542x;
                        f5 f5Var3 = u5Var3.O;
                        if (f5Var3.f5387a) {
                            f5 f5Var4 = u5Var3.M;
                            if (f5Var4 != null) {
                                f5Var3.f5387a = false;
                                f5Var4.f5387a = false;
                            } else {
                                f5Var3.f5387a = false;
                            }
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            u5Var3.N.run(u5Var3);
                        }
                        i5 i5Var2 = u5Var3.f6051f;
                        if (i5Var2 != null) {
                            i5Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(j5Var.getContext(), org.telegram.ui.ActionBar.h6.H8, u5Var.f6054s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = u5Var.f6054s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21095j5, bVar));
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
