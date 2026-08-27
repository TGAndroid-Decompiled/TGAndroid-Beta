package e0;

import android.app.Notification;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class a0 extends b0 {

    public final ArrayList f5038e = new ArrayList();

    public final ArrayList f5039f = new ArrayList();

    public final p0 f5040g;
    public CharSequence h;

    public Boolean f5041i;

    public a0() {
        p0 p0Var = new p0();
        p0Var.f5106a = "";
        p0Var.f5107b = null;
        p0Var.f5108c = null;
        p0Var.d = null;
        p0Var.f5109e = false;
        p0Var.f5110f = false;
        this.f5040g = p0Var;
    }

    @Override
    public final void a(Bundle bundle) {
        super.a(bundle);
        p0 p0Var = this.f5040g;
        bundle.putCharSequence("android.selfDisplayName", p0Var.f5106a);
        bundle.putBundle("android.messagingStyleUser", p0Var.c());
        bundle.putCharSequence("android.hiddenConversationTitle", this.h);
        if (this.h != null && this.f5041i.booleanValue()) {
            bundle.putCharSequence("android.conversationTitle", this.h);
        }
        ArrayList arrayList = this.f5038e;
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArray("android.messages", z.a(arrayList));
        }
        ArrayList arrayList2 = this.f5039f;
        if (!arrayList2.isEmpty()) {
            bundle.putParcelableArray("android.messages.historic", z.a(arrayList2));
        }
        Boolean bool = this.f5041i;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Override
    public final void b(i0 i0Var) {
        boolean zBooleanValue;
        z zVar;
        boolean z10;
        Notification.MessagingStyle messagingStyleB;
        Notification.Builder builder = (Notification.Builder) i0Var.f5066c;
        t tVar = this.f5042a;
        int i10 = 0;
        if (tVar == null || tVar.f5118a.getApplicationInfo().targetSdkVersion >= 28 || this.f5041i != null) {
            Boolean bool = this.f5041i;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else if (this.h != null) {
            zBooleanValue = true;
        } else {
            zBooleanValue = false;
        }
        this.f5041i = Boolean.valueOf(zBooleanValue);
        int i11 = Build.VERSION.SDK_INT;
        ArrayList arrayList = this.f5038e;
        if (i11 >= 24) {
            p0 p0Var = this.f5040g;
            if (i11 >= 28) {
                p0Var.getClass();
                messagingStyleB = w.a(d1.f.D(p0Var));
            } else {
                messagingStyleB = u.b(p0Var.f5106a);
            }
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                u.a(messagingStyleB, ((z) obj).b());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                ArrayList arrayList2 = this.f5039f;
                int size2 = arrayList2.size();
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    v.a(messagingStyleB, ((z) obj2).b());
                }
            }
            if (this.f5041i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                u.c(messagingStyleB, this.h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                w.b(messagingStyleB, this.f5041i.booleanValue());
            }
            messagingStyleB.setBuilder(builder);
            return;
        }
        int size3 = arrayList.size() - 1;
        while (true) {
            if (size3 < 0) {
                if (arrayList.isEmpty()) {
                    zVar = null;
                    break;
                } else {
                    zVar = (z) i0.a.i(1, arrayList);
                    break;
                }
            }
            zVar = (z) arrayList.get(size3);
            p0 p0Var2 = zVar.f5143c;
            if (p0Var2 != null && !TextUtils.isEmpty(p0Var2.f5106a)) {
                break;
            } else {
                size3--;
            }
        }
        if (this.h != null && this.f5041i.booleanValue()) {
            builder.setContentTitle(this.h);
        } else if (zVar != null) {
            builder.setContentTitle("");
            p0 p0Var3 = zVar.f5143c;
            if (p0Var3 != null) {
                builder.setContentTitle(p0Var3.f5106a);
            }
        }
        if (zVar != null) {
            builder.setContentText(this.h != null ? e(zVar) : zVar.f5141a);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.h != null) {
            z10 = true;
            break;
        }
        int size4 = arrayList.size() - 1;
        while (true) {
            if (size4 < 0) {
                z10 = false;
                break;
            }
            p0 p0Var4 = ((z) arrayList.get(size4)).f5143c;
            if (p0Var4 != null && p0Var4.f5106a == null) {
                z10 = true;
                break;
            }
            size4--;
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            z zVar2 = (z) arrayList.get(size5);
            CharSequence charSequenceE = z10 ? e(zVar2) : zVar2.f5141a;
            if (size5 != arrayList.size() - 1) {
                spannableStringBuilder.insert(0, (CharSequence) "\n");
            }
            spannableStringBuilder.insert(0, charSequenceE);
        }
        new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(spannableStringBuilder);
    }

    @Override
    public final String c() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final List d() {
        return this.f5038e;
    }

    public final SpannableStringBuilder e(z zVar) {
        String str = p0.b.f45330b;
        p0.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? p0.b.f45332e : p0.b.d;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        p0 p0Var = zVar.f5143c;
        CharSequence charSequence = p0Var == null ? "" : p0Var.f5106a;
        int i10 = -16777216;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = this.f5040g.f5106a;
            int i11 = this.f5042a.f5137w;
            if (i11 != 0) {
                i10 = i11;
            }
        }
        SpannableStringBuilder spannableStringBuilderC = bVar.c(charSequence);
        spannableStringBuilder.append((CharSequence) spannableStringBuilderC);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null), spannableStringBuilder.length() - spannableStringBuilderC.length(), spannableStringBuilder.length(), 33);
        CharSequence charSequence2 = zVar.f5141a;
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) bVar.c(charSequence2 != null ? charSequence2 : ""));
        return spannableStringBuilder;
    }

    public final void f(String str) {
        this.h = str;
    }

    public a0(p0 p0Var) {
        if (!TextUtils.isEmpty(p0Var.f5106a)) {
            this.f5040g = p0Var;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }
}
