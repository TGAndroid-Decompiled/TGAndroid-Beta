package e0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class y extends z {
    public final ArrayList e = new ArrayList();
    public final ArrayList f6083f = new ArrayList();
    public final l0 f6084g;
    public CharSequence h;
    public Boolean f6085i;

    public y() {
        ?? obj = new Object();
        obj.f6045a = "";
        obj.f6046b = null;
        obj.f6047c = null;
        obj.d = null;
        obj.e = false;
        obj.f6048f = false;
        this.f6084g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        l0 l0Var = this.f6084g;
        bundle.putCharSequence("android.selfDisplayName", l0Var.f6045a);
        bundle.putBundle("android.messagingStyleUser", l0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f6085i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", x.a(arrayList));
        }
        ArrayList arrayList2 = this.f6083f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", x.a(arrayList2));
        }
        Boolean bool = this.f6085i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(cc.f r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.y.b(cc.f):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(x xVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f44531b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        l0 l0Var = xVar.f6081c;
        CharSequence charSequence2 = "";
        if (l0Var == null) {
            charSequence = "";
        } else {
            charSequence = l0Var.f6045a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f6084g.f6045a;
            int i11 = this.f6086a.f6075w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = xVar.f6079a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public y(l0 l0Var) {
        if (!TextUtils.isEmpty(l0Var.f6045a)) {
            this.f6084g = l0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
