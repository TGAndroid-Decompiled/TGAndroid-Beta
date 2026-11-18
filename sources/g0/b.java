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
    public Context f13064a;
    public String f13065b;
    public Intent[] f13066c;
    public ComponentName d;
    public CharSequence f13067e;
    public CharSequence f13068f;
    public CharSequence f13069g;
    public IconCompat h;
    public j0[] f13070i;
    public Set f13071j;
    public g f13072k;
    public boolean f13073l;
    public int f13074m;
    public PersistableBundle f13075n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f13065b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f13066c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f13064a, this.f13065b).setShortLabel(this.f13067e).setIntents(this.f13066c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f13064a));
        }
        if (!TextUtils.isEmpty(this.f13068f)) {
            intents.setLongLabel(this.f13068f);
        }
        if (!TextUtils.isEmpty(this.f13069g)) {
            intents.setDisabledMessage(this.f13069g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f13071j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f13074m);
        PersistableBundle persistableBundle = this.f13075n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f13070i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f13070i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f13072k;
            if (gVar != null) {
                intents.setLocusId(gVar.f11018b);
            }
            intents.setLongLived(this.f13073l);
        } else {
            if (this.f13075n == null) {
                this.f13075n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f13070i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f13075n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f13070i.length) {
                    PersistableBundle persistableBundle2 = this.f13075n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f13070i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f10231a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f10233c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f10234e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f10235f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.f13072k;
            if (gVar2 != null) {
                this.f13075n.putString("extraLocusId", gVar2.f11017a);
            }
            this.f13075n.putBoolean("extraLongLived", this.f13073l);
            intents.setExtras(this.f13075n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ai.d.k(intents);
        }
        return intents.build();
    }
}
