package eh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.b9;
import org.telegram.ui.oe;
public final class e {
    public final o2 f5174a;
    public final TLRPC.Chat f5175b;
    public final int f5176c;
    public FrameLayout d;
    public b f5177e;
    public LinearLayout f5178f;
    public TextView f5179g;
    public ImageView h;
    public c f5180i;
    public TLRPC.ChatFull f5181j;
    public int f5182k;
    public int f5183l = -1;
    public d f5184m;

    public e(TLRPC.Chat chat, o2 o2Var) {
        this.f5174a = o2Var;
        this.f5175b = chat;
        this.f5176c = o2Var.getCurrentAccount();
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
                int i9 = this.f5183l;
                o2 o2Var = this.f5174a;
                TLRPC.Chat chat = this.f5175b;
                if (i9 == -1 && chat != null) {
                    this.f5183l = o2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.f22380id);
                }
                int i10 = this.f5182k;
                int i11 = this.f5183l;
                if (i10 != i11) {
                    if (i11 != 0 && chat != null) {
                        o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22380id, 0);
                    }
                } else {
                    return;
                }
            }
            d dVar = this.f5184m;
            if (dVar != null) {
                dVar.e(z10, z11);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new h6(this.f5179g, 4, null, null, null, null, f6.f23044fe));
        arrayList.add(new h6(this.h, 8, null, null, null, null, f6.f23008de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            o2 o2Var = this.f5174a;
            FrameLayout frameLayout = new FrameLayout(o2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(f6.K0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final e f5172b;

                {
                    this.f5172b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f5172b;
                            o2 o2Var2 = eVar.f5174a;
                            if (eVar.f5180i == null) {
                                eVar.f5180i = new c(eVar, o2Var2, eVar.f5175b.f22380id);
                            }
                            o2Var2.showDialog(eVar.f5180i);
                            return;
                        default:
                            e eVar2 = this.f5172b;
                            eVar2.f5174a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f5175b.f22380id, eVar2.f5182k);
                            eVar2.f5183l = eVar2.f5182k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(o2Var.getParentActivity());
            this.f5178f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f5178f, e6.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            b bVar = new b(0, o2Var.getParentActivity(), false);
            this.f5177e = bVar;
            bVar.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            b9 b9Var = this.f5177e.f27425a;
            for (int i9 = 0; i9 < b9Var.f27076c.length; i9++) {
                b9Var.l(0, null, 0);
            }
            this.f5178f.addView(this.f5177e, e6.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(o2Var.getParentActivity());
            this.f5179g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.f5179g.setGravity(16);
            this.f5179g.setSingleLine();
            this.f5179g.setText((CharSequence) null);
            this.f5179g.setTextColor(o2Var.getThemedColor(f6.f23044fe));
            this.f5179g.setTypeface(AndroidUtilities.bold());
            this.f5178f.addView(this.f5179g, e6.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(o2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(f6.f0(o2Var.getThemedColor(f6.f23352x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(o2Var.getThemedColor(f6.f23008de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) {
                public final e f5172b;

                {
                    this.f5172b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            e eVar = this.f5172b;
                            o2 o2Var2 = eVar.f5174a;
                            if (eVar.f5180i == null) {
                                eVar.f5180i = new c(eVar, o2Var2, eVar.f5175b.f22380id);
                            }
                            o2Var2.showDialog(eVar.f5180i);
                            return;
                        default:
                            e eVar2 = this.f5172b;
                            eVar2.f5174a.getMessagesController().setChatPendingRequestsOnClose(eVar2.f5175b.f22380id, eVar2.f5182k);
                            eVar2.f5183l = eVar2.f5182k;
                            eVar2.a(false, true);
                            return;
                    }
                }
            });
            this.d.addView(this.h, e6.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.f5181j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(oe oeVar) {
        this.f5184m = oeVar;
    }

    public final void e(int i9, List list, boolean z10) {
        if (this.d != null) {
            o2 o2Var = this.f5174a;
            if (i9 <= 0) {
                TLRPC.Chat chat = this.f5175b;
                if (chat != null) {
                    o2Var.getMessagesController().setChatPendingRequestsOnClose(chat.f22380id, 0);
                    this.f5183l = 0;
                }
                a(false, z10);
                this.f5182k = 0;
            } else if (this.f5182k != i9) {
                this.f5182k = i9;
                this.f5179g.setText(LocaleController.formatPluralString("JoinUsersRequests", i9, new Object[0]));
                a(true, z10);
                if (list != null && !list.isEmpty()) {
                    int min = Math.min(3, list.size());
                    for (int i10 = 0; i10 < min; i10++) {
                        TLRPC.User user = o2Var.getMessagesController().getUser((Long) list.get(i10));
                        if (user != null) {
                            this.f5177e.b(i10, user, this.f5176c);
                        }
                    }
                    this.f5177e.setCount(min);
                    this.f5177e.a(true);
                }
            }
        }
    }
}
