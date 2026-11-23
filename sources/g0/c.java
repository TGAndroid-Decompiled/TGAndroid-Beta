package g0;

import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class c {
    public Context f13055a;
    public String f13056b;
    public Intent[] f13057c;
    public ComponentName d;
    public CharSequence f13058e;
    public CharSequence f13059f;
    public CharSequence f13060g;
    public IconCompat h;
    public j0[] f13061i;
    public Set f13062j;
    public f0.g f13063k;
    public boolean f13064l;
    public int f13065m;
    public PersistableBundle f13066n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13056b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13057c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13055a, this.f13056b).setShortLabel(this.f13058e).setIntents(this.f13057c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13055a));
        }
        if (!TextUtils.isEmpty(this.f13059f)) {
            intents.setLongLabel(this.f13059f);
        }
        if (!TextUtils.isEmpty(this.f13060g)) {
            intents.setDisabledMessage(this.f13060g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13062j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13065m);
        PersistableBundle persistableBundle = this.f13066n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13061i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13061i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            f0.g gVar = this.f13063k;
            if (gVar != null) {
                intents.setLocusId(gVar.f11008b);
            }
            intents.setLongLived(this.f13064l);
        } else {
            if (this.f13066n == null) {
                this.f13066n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13061i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13066n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13061i.length) {
                    PersistableBundle persistableBundle2 = this.f13066n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13061i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10221a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10223c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10224e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10225f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            f0.g gVar2 = this.f13063k;
            if (gVar2 != null) {
                this.f13066n.putString("extraLocusId", gVar2.f11007a);
            }
            this.f13066n.putBoolean("extraLongLived", this.f13064l);
            intents.setExtras(this.f13066n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.i(intents);
        }
        return intents.build();
    }
}
