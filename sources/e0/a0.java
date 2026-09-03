package e0;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public final class a0 extends b0 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f4958f = new ArrayList();
    public final o0 f4959g;
    public CharSequence h;
    public Boolean f4960i;

    public a0() {
        ?? obj = new Object();
        obj.f5012a = "";
        obj.f5013b = null;
        obj.f5014c = null;
        obj.d = null;
        obj.e = false;
        obj.f5015f = false;
        this.f4959g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        o0 o0Var = this.f4959g;
        bundle.putCharSequence("android.selfDisplayName", o0Var.f5012a);
        bundle.putBundle("android.messagingStyleUser", o0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f4960i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", z.a(arrayList));
        }
        ArrayList arrayList2 = this.f4958f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", z.a(arrayList2));
        }
        Boolean bool = this.f4960i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(a4.k r10) {
        throw new UnsupportedOperationException("Method not decompiled: e0.a0.b(a4.k):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.e;
    }

    public final SpannableStringBuilder e(z zVar) {
        p0.b bVar;
        CharSequence charSequence;
        String str = p0.b.f40949b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            bVar = p0.b.e;
        } else {
            bVar = p0.b.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        o0 o0Var = zVar.f5047c;
        CharSequence charSequence2 = "";
        if (o0Var == null) {
            charSequence = "";
        } else {
            charSequence = o0Var.f5012a;
        }
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f4959g.f5012a;
            int i11 = this.f4961a.f5041w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder c3 = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) c3);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - c3.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence3 = zVar.f5045a;
        if (charSequence3 != null) {
            charSequence2 = charSequence3;
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public a0(o0 o0Var) {
        if (!TextUtils.isEmpty(o0Var.f5012a)) {
            this.f4959g = o0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
