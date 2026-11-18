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
import f0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public final class b {
    public Context f13061a;
    public String f13062b;
    public Intent[] f13063c;
    public ComponentName d;
    public CharSequence f13064e;
    public CharSequence f13065f;
    public CharSequence f13066g;
    public IconCompat h;
    public j0[] f13067i;
    public Set f13068j;
    public g f13069k;
    public boolean f13070l;
    public int f13071m;
    public PersistableBundle f13072n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13062b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13063c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13061a, this.f13062b).setShortLabel(this.f13064e).setIntents(this.f13063c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13061a));
        }
        if (!TextUtils.isEmpty(this.f13065f)) {
            intents.setLongLabel(this.f13065f);
        }
        if (!TextUtils.isEmpty(this.f13066g)) {
            intents.setDisabledMessage(this.f13066g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13068j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13071m);
        PersistableBundle persistableBundle = this.f13072n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13067i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13067i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f13069k;
            if (gVar != null) {
                intents.setLocusId(gVar.f11015b);
            }
            intents.setLongLived(this.f13070l);
        } else {
            if (this.f13072n == null) {
                this.f13072n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13067i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13072n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13067i.length) {
                    PersistableBundle persistableBundle2 = this.f13072n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13067i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10228a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10230c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10231e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10232f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.f13069k;
            if (gVar2 != null) {
                this.f13072n.putString("extraLocusId", gVar2.f11014a);
            }
            this.f13072n.putBoolean("extraLongLived", this.f13070l);
            intents.setExtras(this.f13072n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ai.d.k(intents);
        }
        return intents.build();
    }
}
