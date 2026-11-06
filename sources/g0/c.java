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
    public Context f13396a;
    public String f13397b;
    public Intent[] f13398c;
    public ComponentName d;
    public CharSequence f13399e;
    public CharSequence f13400f;
    public CharSequence f13401g;
    public IconCompat h;
    public j0[] f13402i;
    public Set f13403j;
    public g f13404k;
    public boolean f13405l;
    public int f13406m;
    public PersistableBundle f13407n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13397b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13398c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13396a, this.f13397b).setShortLabel(this.f13399e).setIntents(this.f13398c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13396a));
        }
        if (!TextUtils.isEmpty(this.f13400f)) {
            intents.setLongLabel(this.f13400f);
        }
        if (!TextUtils.isEmpty(this.f13401g)) {
            intents.setDisabledMessage(this.f13401g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13403j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13406m);
        PersistableBundle persistableBundle = this.f13407n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13402i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13402i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f13404k;
            if (gVar != null) {
                intents.setLocusId(gVar.f10882b);
            }
            intents.setLongLived(this.f13405l);
        } else {
            if (this.f13407n == null) {
                this.f13407n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13402i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13407n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13402i.length) {
                    PersistableBundle persistableBundle2 = this.f13407n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13402i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10077a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10079c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10080e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10081f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.f13404k;
            if (gVar2 != null) {
                this.f13407n.putString("extraLocusId", gVar2.f10881a);
            }
            this.f13407n.putBoolean("extraLongLived", this.f13405l);
            intents.setExtras(this.f13407n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.i(intents);
        }
        return intents.build();
    }
}
