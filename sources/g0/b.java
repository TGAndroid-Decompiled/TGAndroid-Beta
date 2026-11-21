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
    public Context f13090a;
    public String f13091b;
    public Intent[] f13092c;
    public ComponentName d;
    public CharSequence f13093e;
    public CharSequence f13094f;
    public CharSequence f13095g;
    public IconCompat h;
    public j0[] f13096i;
    public Set f13097j;
    public g f13098k;
    public boolean f13099l;
    public int f13100m;
    public PersistableBundle f13101n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13091b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13092c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13090a, this.f13091b).setShortLabel(this.f13093e).setIntents(this.f13092c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13090a));
        }
        if (!TextUtils.isEmpty(this.f13094f)) {
            intents.setLongLabel(this.f13094f);
        }
        if (!TextUtils.isEmpty(this.f13095g)) {
            intents.setDisabledMessage(this.f13095g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13097j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13100m);
        PersistableBundle persistableBundle = this.f13101n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13096i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13096i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f13098k;
            if (gVar != null) {
                intents.setLocusId(gVar.f11044b);
            }
            intents.setLongLived(this.f13099l);
        } else {
            if (this.f13101n == null) {
                this.f13101n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13096i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13101n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13096i.length) {
                    PersistableBundle persistableBundle2 = this.f13101n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13096i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10257a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10259c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10260e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10261f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.f13098k;
            if (gVar2 != null) {
                this.f13101n.putString("extraLocusId", gVar2.f11043a);
            }
            this.f13101n.putBoolean("extraLongLived", this.f13099l);
            intents.setExtras(this.f13101n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ai.d.l(intents);
        }
        return intents.build();
    }
}
