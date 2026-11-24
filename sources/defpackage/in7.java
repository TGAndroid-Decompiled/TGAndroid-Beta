package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Locale;
public final class in7 extends jn7 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final n58 g;
    public String h;
    public Boolean i;

    public in7() {
        ?? obj = new Object();
        obj.a = "";
        obj.b = null;
        obj.c = null;
        obj.d = null;
        obj.e = false;
        obj.f = false;
        this.g = obj;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        n58 n58Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", n58Var.a);
        bundle.putBundle("android.messagingStyleUser", n58Var.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", hn7.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", hn7.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(defpackage.p41 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in7.b(p41):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final SpannableStringBuilder d(hn7 hn7Var) {
        si0 si0Var;
        String str = si0.b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            si0Var = si0.e;
        } else {
            si0Var = si0.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = hn7Var.c.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i2 = this.a.w;
            if (i2 != 0) {
                i = i2;
            }
        }
        SpannableStringBuilder c = si0Var.c(charSequence);
        spannableStringBuilder.append((CharSequence) c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = hn7Var.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) si0Var.c(charSequence2));
        return spannableStringBuilder;
    }

    public in7(n58 n58Var) {
        if (!TextUtils.isEmpty(n58Var.a)) {
            this.g = n58Var;
        } else {
            u36.j("User's name must not be empty.");
            throw null;
        }
    }
}
