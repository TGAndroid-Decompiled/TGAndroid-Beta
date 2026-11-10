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
public final class c {
    public Context f13398a;
    public String f13399b;
    public Intent[] f13400c;
    public ComponentName d;
    public CharSequence f13401e;
    public CharSequence f13402f;
    public CharSequence f13403g;
    public IconCompat h;
    public j0[] f13404i;
    public Set f13405j;
    public g f13406k;
    public boolean f13407l;
    public int f13408m;
    public PersistableBundle f13409n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13399b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13400c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13398a, this.f13399b).setShortLabel(this.f13401e).setIntents(this.f13400c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13398a));
        }
        if (!TextUtils.isEmpty(this.f13402f)) {
            intents.setLongLabel(this.f13402f);
        }
        if (!TextUtils.isEmpty(this.f13403g)) {
            intents.setDisabledMessage(this.f13403g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13405j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13408m);
        PersistableBundle persistableBundle = this.f13409n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13404i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13404i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f13406k;
            if (gVar != null) {
                intents.setLocusId(gVar.f10887b);
            }
            intents.setLongLived(this.f13407l);
        } else {
            if (this.f13409n == null) {
                this.f13409n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13404i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13409n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13404i.length) {
                    PersistableBundle persistableBundle2 = this.f13409n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13404i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10082a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10084c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10085e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10086f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.f13406k;
            if (gVar2 != null) {
                this.f13409n.putString("extraLocusId", gVar2.f10886a);
            }
            this.f13409n.putBoolean("extraLongLived", this.f13407l);
            intents.setExtras(this.f13409n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.i(intents);
        }
        return intents.build();
    }
}
