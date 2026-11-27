package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Locale;
public final class eo7 extends fo7 {
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final b78 g;
    public String h;
    public Boolean i;

    public eo7() {
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
        b78 b78Var = this.g;
        bundle.putCharSequence("android.selfDisplayName", b78Var.a);
        bundle.putBundle("android.messagingStyleUser", b78Var.b());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", do7.a(arrayList));
        }
        ArrayList arrayList2 = this.f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", do7.a(arrayList2));
        }
        Boolean bool = this.i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(defpackage.q31 r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo7.b(q31):void");
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final SpannableStringBuilder d(do7 do7Var) {
        th0 th0Var;
        String str = th0.b;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            th0Var = th0.e;
        } else {
            th0Var = th0.d;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence charSequence = do7Var.c.a;
        int i = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.g.a;
            int i2 = this.a.w;
            if (i2 != 0) {
                i = i2;
            }
        }
        SpannableStringBuilder c = th0Var.c(charSequence);
        spannableStringBuilder.append((CharSequence) c);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null), spannableStringBuilder.length() - c.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = do7Var.a;
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) th0Var.c(charSequence2));
        return spannableStringBuilder;
    }

    public eo7(b78 b78Var) {
        if (!TextUtils.isEmpty(b78Var.a)) {
            this.g = b78Var;
        } else {
            lq5.j("User's name must not be empty.");
            throw null;
        }
    }
}
