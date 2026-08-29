package lh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.rr;
public final class r4 extends rr {
    public final s4 f16164c;

    public r4(s4 s4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.f16164c = s4Var;
    }

    @Override
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        s4 s4Var = this.f16164c;
        c5 c5Var = s4Var.f16214x;
        b5 b5Var = c5Var.A;
        if (b5Var != null && b5Var.f15387f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = R.drawable.menu_views_reposts;
        } else if (c5Var.K.f16017a) {
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
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i14, LocaleController.getString(i11), false, c5Var.f15439s);
        if (!c5Var.K.f16017a) {
            c3.setAlpha(0.5f);
        }
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final r4 f16125b;

            {
                this.f16125b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f16125b.f16164c.f16214x;
                        o4 o4Var = c5Var2.K;
                        if (!o4Var.f16017a) {
                            o4 o4Var2 = c5Var2.I;
                            if (o4Var2 != null) {
                                o4Var.f16017a = true;
                                o4Var2.f16017a = true;
                            } else {
                                o4Var.f16017a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.J.accept(c5Var2);
                        }
                        r4 r4Var = c5Var2.f15436f;
                        if (r4Var != null) {
                            r4Var.a();
                            return;
                        }
                        return;
                    default:
                        c5 c5Var3 = this.f16125b.f16164c.f16214x;
                        o4 o4Var3 = c5Var3.K;
                        if (o4Var3.f16017a) {
                            o4 o4Var4 = c5Var3.I;
                            if (o4Var4 != null) {
                                o4Var3.f16017a = false;
                                o4Var4.f16017a = false;
                            } else {
                                o4Var3.f16017a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.J.accept(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f15436f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        if (!c5Var.K.f16017a) {
            i12 = R.drawable.menu_views_recent2;
        } else {
            i12 = R.drawable.menu_views_recent;
        }
        org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, i12, LocaleController.getString(R.string.SortByTime), false, c5Var.f15439s);
        if (c5Var.K.f16017a) {
            c6.setAlpha(0.5f);
        }
        c6.setOnClickListener(new View.OnClickListener(this) {
            public final r4 f16125b;

            {
                this.f16125b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        c5 c5Var2 = this.f16125b.f16164c.f16214x;
                        o4 o4Var = c5Var2.K;
                        if (!o4Var.f16017a) {
                            o4 o4Var2 = c5Var2.I;
                            if (o4Var2 != null) {
                                o4Var.f16017a = true;
                                o4Var2.f16017a = true;
                            } else {
                                o4Var.f16017a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.J.accept(c5Var2);
                        }
                        r4 r4Var = c5Var2.f15436f;
                        if (r4Var != null) {
                            r4Var.a();
                            return;
                        }
                        return;
                    default:
                        c5 c5Var3 = this.f16125b.f16164c.f16214x;
                        o4 o4Var3 = c5Var3.K;
                        if (o4Var3.f16017a) {
                            o4 o4Var4 = c5Var3.I;
                            if (o4Var4 != null) {
                                o4Var3.f16017a = false;
                                o4Var4.f16017a = false;
                            } else {
                                o4Var3.f16017a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.J.accept(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f15436f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            return;
                        }
                        return;
                }
            }
        });
        View l1Var = new org.telegram.ui.ActionBar.l1(s4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c5Var.f15439s);
        l1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, i7.f6.n(-1, 8));
        if (z10) {
            i13 = R.string.StoryReactionsSortDescription;
        } else {
            i13 = R.string.StoryViewsSortDescription;
        }
        String string = LocaleController.getString(i13);
        b bVar = c5Var.f15439s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, i7.f6.n(-1, -2));
    }

    @Override
    public final void c() {
    }
}
