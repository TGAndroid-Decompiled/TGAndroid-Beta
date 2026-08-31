package kh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.c9;
import org.telegram.ui.te;
public final class e {
    public final p2 f11236a;
    public final TLRPC.Chat f11237b;
    public final int f11238c;
    public FrameLayout d;
    public b f11239e;
    public LinearLayout f11240f;
    public TextView f11241g;
    public ImageView h;
    public c f11242i;
    public TLRPC.ChatFull f11243j;
    public int f11244k;
    public int f11245l = -1;
    public d f11246m;

    public e(TLRPC.Chat chat, p2 p2Var) {
        this.f11236a = p2Var;
        this.f11237b = chat;
        this.f11238c = p2Var.getCurrentAccount();
    }

    public final void a(boolean z4, boolean z10) {
        boolean z11;
        if (this.d.getVisibility() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 != z11) {
            if (z4) {
                int i10 = this.f11245l;
                p2 p2Var = this.f11236a;
                TLRPC.Chat chat = this.f11237b;
                if (i10 == -1 && chat != null) {
                    this.f11245l = p2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f20843id);
                }
                int i11 = this.f11244k;
                int i12 = this.f11245l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20843id, 0);
                    }
                } else {
                    return;
                }
            }
            d dVar = this.f11246m;
            if (dVar != null) {
                dVar.g(z4, z10);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new m6(this.f11241g, 4, null, null, null, null, k6.f21703fe));
        arrayList.add(new m6(this.h, 8, null, null, null, null, k6.f21667de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            p2 p2Var = this.f11236a;
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(k6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final e f11234b;

                {
                    this.f11234b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f11234b;
                            p2 p2Var2 = eVar.f11236a;
                            if (eVar.f11242i == null) {
                                eVar.f11242i = new c(eVar, p2Var2, eVar.f11237b.f20843id);
                            }
                            p2Var2.showDialog(eVar.f11242i);
                            return;
                        default:
                            e eVar2 = this.f11234b;
                            eVar2.f11236a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f11237b.f20843id, eVar2.f11244k);
                            eVar2.f11245l = eVar2.f11244k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(p2Var.getParentActivity());
            this.f11240f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f11240f, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0, p2Var.getParentActivity(), false);
            this.f11239e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            c9 c9Var = this.f11239e.f26228a;
            for (int i10 = 0; i10 < c9Var.f25866c.length; i10++) {
                c9Var.l(0, null, 0);
            }
            this.f11240f.addView(this.f11239e, c6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(p2Var.getParentActivity());
            this.f11241g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f11241g.setGravity(16);
            this.f11241g.setSingleLine();
            this.f11241g.setText((CharSequence) null);
            this.f11241g.setTextColor(p2Var.getThemedColor(k6.f21703fe));
            this.f11241g.setTypeface(AndroidUtilities.bold());
            this.f11240f.addView(this.f11241g, c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(p2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(k6.f0(p2Var.getThemedColor(k6.f22018x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(p2Var.getThemedColor(k6.f21667de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final e f11234b;

                {
                    this.f11234b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f11234b;
                            p2 p2Var2 = eVar.f11236a;
                            if (eVar.f11242i == null) {
                                eVar.f11242i = new c(eVar, p2Var2, eVar.f11237b.f20843id);
                            }
                            p2Var2.showDialog(eVar.f11242i);
                            return;
                        default:
                            e eVar2 = this.f11234b;
                            eVar2.f11236a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f11237b.f20843id, eVar2.f11244k);
                            eVar2.f11245l = eVar2.f11244k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, c6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f11243j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(te teVar) {
        this.f11246m = teVar;
    }

    public final void e(int i10, List list, boolean z4) {
        if (this.d != null) {
            p2 p2Var = this.f11236a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f11237b;
                if (chat != null) {
                    p2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f20843id, 0);
                    this.f11245l = 0;
                }
                a(false, z4);
                this.f11244k = 0;
            } else if (this.f11244k != i10) {
                this.f11244k = i10;
                this.f11241g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z4);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = p2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.f11239e.b(i11, user, this.f11238c);
                        }
                    }
                    this.f11239e.setCount(min);
                    this.f11239e.a(true);
                }
            }
        }
    }
}
