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
    public final ArrayList e = new ArrayList();
    public final ArrayList f9602f = new ArrayList();
    public final l0 f9603g;
    public CharSequence h;
    public Boolean f9604i;

    public x() {
        ?? obj = new Object();
        obj.f9565a = "";
        obj.f9566b = null;
        obj.f9567c = null;
        obj.d = null;
        obj.e = false;
        obj.f9568f = false;
        this.f9603g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        l0 l0Var = this.f9603g;
        bundle.putCharSequence("android.selfDisplayName", l0Var.f9565a);
        bundle.putBundle("android.messagingStyleUser", l0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f9604i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", w.a(arrayList));
        }
        ArrayList arrayList2 = this.f9602f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", w.a(arrayList2));
        }
        Boolean bool = this.f9604i;
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
        return this.e;
    }

    public final SpannableStringBuilder e(w wVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f46470b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        l0 l0Var = wVar.f9600c;
        CharSequence charSequence2 = "";
        if (l0Var == null) {
            charSequence = "";
        } else {
            charSequence = l0Var.f9565a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f9603g.f9565a;
            int i11 = this.f9605a.f9594w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c10 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c10);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c10.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = wVar.f9598a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public x(l0 l0Var) {
        if (!TextUtils.isEmpty(l0Var.f9565a)) {
            this.f9603g = l0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
