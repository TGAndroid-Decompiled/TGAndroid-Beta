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
    public Context f12747a;
    public String f12748b;
    public Intent[] f12749c;
    public ComponentName d;
    public CharSequence f12750e;
    public CharSequence f12751f;
    public CharSequence f12752g;
    public IconCompat h;
    public j0[] f12753i;
    public Set f12754j;
    public g f12755k;
    public boolean f12756l;
    public int f12757m;
    public PersistableBundle f12758n;

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final String b() {
        return this.f12748b;
    }

    public final Intent c() {
        Intent[] intentArr = this.f12749c;
        return intentArr[intentArr.length - 1];
    }

    public final ShortcutInfo d() {
        String str;
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f12747a, this.f12748b).setShortLabel(this.f12750e).setIntents(this.f12749c);
        IconCompat iconCompat = this.h;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.m(this.f12747a));
        }
        if (!TextUtils.isEmpty(this.f12751f)) {
            intents.setLongLabel(this.f12751f);
        }
        if (!TextUtils.isEmpty(this.f12752g)) {
            intents.setDisabledMessage(this.f12752g);
        }
        ComponentName componentName = this.d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f12754j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f12757m);
        PersistableBundle persistableBundle = this.f12758n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i7 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            j0[] j0VarArr = this.f12753i;
            if (j0VarArr != null && j0VarArr.length > 0) {
                int length = j0VarArr.length;
                Person[] personArr = new Person[length];
                while (i7 < length) {
                    j0 j0Var = this.f12753i[i7];
                    j0Var.getClass();
                    personArr[i7] = d1.f.E(j0Var);
                    i7++;
                }
                intents.setPersons(personArr);
            }
            g gVar = this.f12755k;
            if (gVar != null) {
                intents.setLocusId(gVar.f10698b);
            }
            intents.setLongLived(this.f12756l);
        } else {
            if (this.f12758n == null) {
                this.f12758n = new PersistableBundle();
            }
            j0[] j0VarArr2 = this.f12753i;
            if (j0VarArr2 != null && j0VarArr2.length > 0) {
                this.f12758n.putInt("extraPersonCount", j0VarArr2.length);
                while (i7 < this.f12753i.length) {
                    PersistableBundle persistableBundle2 = this.f12758n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i10 = i7 + 1;
                    sb2.append(i10);
                    String sb3 = sb2.toString();
                    j0 j0Var2 = this.f12753i[i7];
                    j0Var2.getClass();
                    PersistableBundle persistableBundle3 = new PersistableBundle();
                    CharSequence charSequence = j0Var2.f9913a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    } else {
                        str = null;
                    }
                    persistableBundle3.putString("name", str);
                    persistableBundle3.putString("uri", j0Var2.f9915c);
                    persistableBundle3.putString("key", j0Var2.d);
                    persistableBundle3.putBoolean("isBot", j0Var2.f9916e);
                    persistableBundle3.putBoolean("isImportant", j0Var2.f9917f);
                    persistableBundle2.putPersistableBundle(sb3, persistableBundle3);
                    i7 = i10;
                }
            }
            g gVar2 = this.f12755k;
            if (gVar2 != null) {
                this.f12758n.putString("extraLocusId", gVar2.f10697a);
            }
            this.f12758n.putBoolean("extraLongLived", this.f12756l);
            intents.setExtras(this.f12758n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ai.d.k(intents);
        }
        return intents.build();
    }
}
