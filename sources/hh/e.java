package hh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.me;
public final class e {
    public final o2 f8052a;
    public final TLRPC.Chat f8053b;
    public final int f8054c;
    public FrameLayout d;
    public b f8055e;
    public LinearLayout f8056f;
    public TextView f8057g;
    public ImageView h;
    public c f8058i;
    public TLRPC.ChatFull f8059j;
    public int f8060k;
    public int f8061l = -1;
    public d f8062m;

    public e(TLRPC.Chat chat, o2 o2Var) {
        this.f8052a = o2Var;
        this.f8053b = chat;
        this.f8054c = o2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12;
        if (this.d.getVisibility() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                int i10 = this.f8061l;
                o2 o2Var = this.f8052a;
                TLRPC.Chat chat = this.f8053b;
                if (i10 == -1 && chat != null) {
                    this.f8061l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f22392id);
                }
                int i11 = this.f8060k;
                int i12 = this.f8061l;
                if (i11 != i12) {
                    if (i12 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22392id, 0);
                    }
                } else {
                    return;
                }
            }
            d dVar = this.f8062m;
            if (dVar != null) {
                dVar.f(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new i6(this.f8057g, 4, null, null, null, null, g6.f23106fe));
        arrayList.add(new i6(this.h, 8, null, null, null, null, g6.f23069de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            o2 o2Var = this.f8052a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(g6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final e f8050b;

                {
                    this.f8050b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f8050b;
                            o2 o2Var2 = eVar.f8052a;
                            if (eVar.f8058i == null) {
                                eVar.f8058i = new c(eVar, o2Var2, eVar.f8053b.f22392id);
                            }
                            o2Var2.showDialog(eVar.f8058i);
                            return;
                        default:
                            e eVar2 = this.f8050b;
                            eVar2.f8052a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f8053b.f22392id, eVar2.f8060k);
                            eVar2.f8061l = eVar2.f8060k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f8056f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f8056f, f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0, o2Var.getParentActivity(), false);
            this.f8055e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            g9 g9Var = this.f8055e.f29141a;
            for (int i10 = 0; i10 < g9Var.f28825c.length; i10++) {
                g9Var.l(0, null, 0);
            }
            this.f8056f.addView(this.f8055e, f6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f8057g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f8057g.setGravity(16);
            this.f8057g.setSingleLine();
            this.f8057g.setText((CharSequence) null);
            this.f8057g.setTextColor(o2Var.getThemedColor(g6.f23106fe));
            this.f8057g.setTypeface(AndroidUtilities.bold());
            this.f8056f.addView(this.f8057g, f6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(g6.f0(o2Var.getThemedColor(g6.f23419x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(o2Var.getThemedColor(g6.f23069de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final e f8050b;

                {
                    this.f8050b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f8050b;
                            o2 o2Var2 = eVar.f8052a;
                            if (eVar.f8058i == null) {
                                eVar.f8058i = new c(eVar, o2Var2, eVar.f8053b.f22392id);
                            }
                            o2Var2.showDialog(eVar.f8058i);
                            return;
                        default:
                            e eVar2 = this.f8050b;
                            eVar2.f8052a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f8053b.f22392id, eVar2.f8060k);
                            eVar2.f8061l = eVar2.f8060k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, f6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f8059j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(me meVar) {
        this.f8062m = meVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f8052a;
            if (i10 <= 0) {
                TLRPC.Chat chat = this.f8053b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22392id, 0);
                    this.f8061l = 0;
                }
                a(false, z10);
                this.f8060k = 0;
            } else if (this.f8060k != i10) {
                this.f8060k = i10;
                this.f8057g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i11 = 0; i11 < min; i11++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i11));
                        if (user != null) {
                            this.f8055e.b(i11, user, this.f8054c);
                        }
                    }
                    this.f8055e.setCount(min);
                    this.f8055e.a(true);
                }
            }
        }
    }
}
