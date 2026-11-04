package e0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class x extends y {
    public final ArrayList f9306e = new ArrayList();
    public final ArrayList f9307f = new ArrayList();
    public final k0 f9308g;
    public CharSequence h;
    public Boolean f9309i;

    public x() {
        ?? obj = new Object();
        obj.f9264a = "";
        obj.f9265b = null;
        obj.f9266c = null;
        obj.d = null;
        obj.f9267e = false;
        obj.f9268f = false;
        this.f9308g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        k0 k0Var = this.f9308g;
        bundle.putCharSequence("android.selfDisplayName", k0Var.f9264a);
        bundle.putBundle("android.messagingStyleUser", k0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f9309i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.f9306e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f9307f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.f9309i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(e0.e0 r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.x.b(e0.e0):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.f9306e;
    }

    public final SpannableStringBuilder e(w wVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f53047b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.f53049e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        k0 k0Var = wVar.f9303c;
        CharSequence charSequence2 = "";
        if (k0Var == null) {
            charSequence = "";
        } else {
            charSequence = k0Var.f9264a;
        }
        int i3 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f9308g.f9264a;
            int i10 = this.f9310a.f9297w;
            if (i10 != 0) {
                i3 = i10;
            }
        }
        SpannableStringBuilder c2 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c2);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i3), null), spannableStringBuilder.length() - c2.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = wVar.f9301a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(k0 k0Var) {
        if (!TextUtils.isEmpty(k0Var.f9264a)) {
            this.f9308g = k0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
